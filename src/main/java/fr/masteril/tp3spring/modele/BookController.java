package fr.masteril.tp3spring.modele;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController{
    private final IBookDAO dao;

    @Autowired
    public BookController(IBookDAO dao) {
        this.dao = dao;
        initData();
    }

    @GetMapping(value = "/Books")
    public List<Book> getDatas(){
        return dao.findAll();
    }

    @GetMapping(value = "/Books/{id}")
    public Book getData(@PathVariable int id){
        return dao.findById(id);
    }

    @PostMapping(value = "Books")
    public void addData(@RequestBody Book data){
        dao.save(data);
    }

    @DeleteMapping(value = "Books/{id}")
    public void deleteData(@PathVariable int id) {
        dao.delete(id);
    }

    @PutMapping(value = "Books/{id}")
    public void updateData(@PathVariable int id, @RequestBody Book book) {
        dao.update(id, book);
    }

    private void initData() {
        dao.save(new Book(
                "The Hobbit; or, There and Back Again",
                "J. R. R. Tolkien",
                "Now a major motion picture\n A great modern classic and the prelude to THE LORD OF THE RINGS\n Bilbo Baggins is a hobbit who enjoys a comfortable, unambitious life, rarely traveling any farther than his pantry or cellar. But his contentment is disturbed when the wizard Gandalf and a company of dwarves arrive on his doorstep one day to whisk him away on an adventure. They have launched a plot to raid the treasure hoard guarded by Smaug the Magnificent, a large and very dangerous dragon. Bilbo reluctantly joins their quest, unaware that on his journey to the Lonely Mountain he will encounter both a magic ring and a frightening creature known as Gollum.\n “A glorious account of a magnificent adventure, filled with suspense and seasoned with a quiet humor that is irresistible . . . All those, young or old, who love a fine adventurous tale, beautifully told, will take The Hobbit to their hearts.” – New York Times Book Review",
                "Amazon",
                8.50f
        ));
        dao.save(new Book(
                "The Silmarillion",
                "J. R. R. Tolkien",
                "A number-one New York Times bestseller when it was originally published, THE SILMARILLION is the core of J.R.R. Tolkien's imaginative writing, a work whose origins stretch back to a time long before THE HOBBIT.\n Tolkien considered THE SILMARILLION his most important work, and, though it was published last and posthumously, this great collection of tales and legends clearly sets the stage for all his other writing. The story of the creation of the world and of the the First Age, this is the ancient drama to which the characters in THE LORD OF THE RINGS look back and in whose events some of them, such as Elrond and Galadriel, took part. The three Silmarils were jewels created by Feanor, most gifted of the Elves. Within them was imprisoned the Light of the Two Trees of Valinor before the Trees themselves were destroyed by Morgoth, the first Dark Lord. Thereafter, the unsullied Light of Valinor lived on only in the Silmarils, but they were seized by Morgoth and set in his crown, which was guarded in the impenetrable fortress of Angband in the north of Middle-earth. THE SILMARILLION is the history of the rebellion of Feanor and his kindred against the gods, their exile from Valinor and return to Middle-earth, and their war, hopeless despite all their heroism, against the great Enemy.\n This second edition features a letter written by J.R.R. Tolkien describing his intentions for the book, which serves as a brilliant exposition of his conception of the earlier Ages of Middle-earth.",
                "Fnac",
                13.75f
        ));
        dao.save(new Book(
                "The Fellowship of the Ring: Being the First Part of The Lord of the Rings",
                "J. R. R. Tolkien",
                "The first volume in J.R.R. Tolkien's epic adventure THE LORD OF THE RINGS\n One Ring to rule them all, One Ring to find them, One Ring to bring them all and in the darkness bind them\n In ancient times the Rings of Power were crafted by the Elven-smiths, and Sauron, the Dark Lord, forged the One Ring, filling it with his own power so that he could rule all others. But the One Ring was taken from him, and though he sought it throughout Middle-earth, it remained lost to him. After many ages it fell into the hands of Bilbo Baggins, as told in The Hobbit. In a sleepy village in the Shire, young Frodo Baggins finds himself faced with an immense task, as his elderly cousin Bilbo entrusts the Ring to his care. Frodo must leave his home and make a perilous journey across Middle-earth to the Cracks of Doom, there to destroy the Ring and foil the Dark Lord in his evil purpose.\n“A unique, wholly realized other world, evoked from deep in the well of Time, massively detailed, absorbingly entertaining, profound in meaning.” – New York Times",
                "Fnac",
                17.5f
        ));
        dao.save(new Book(
                "Tolkien's World from A to Z: The Complete Guide to Middle-Earth",
                "Robert Foster",
                "For the millions who have already ventured to Middle-earth, and for the countless others who have yet to embark on the journey–here is the one indispensable A-to-Z guide that brings Tolkien’s universe to life.\n\n EVERY CHARACTER\n From Adaldrida Brandybuck to Zaragamba–every Hobbit, Elf, Dwarf, Man, Orc, or other resident of Middle-earth is vividly described and accurately located in proper place and time.\n\n EVERY PLACE\n Colorfully detailed descriptions of geographical entries allow you to pick up the action anywhere in Middle-earth and follow it through all five volumes.\n\n EVERY THING\n From stars and streams to food and flora, everything found in Middle-earth is alphabetically listed and, when necessary, cross-referenced.\n\n HERE IS TRULY A MASTER KEY\nTO TOLKIEN’S MIDDLE-EARTH",
                "Hall du livre",
                25f
        ));
    }
}
