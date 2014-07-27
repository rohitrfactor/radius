package com.example.hostle;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**@author - Rohit Nagpal **/
/**
 * A fragment representing a single step in a wizard. The fragment shows a dummy title indicating
 * the page number, along with some dummy text.
 *
 * <p>This class is used by the {@link CardFlipActivity} and {@link
 * ScreenSlideActivity} samples.</p>
 */
public class ScreenSlidePageFragment extends Fragment {
    /**
     * The argument key for the page number this fragment represents.
     */
    public static final String ARG_PAGE = "page";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     */
    private int mPageNumber;

    /**
     * Factory method for this fragment class. Constructs a new fragment for the given page number.
     */
    public static ScreenSlidePageFragment create(int pageNumber) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ScreenSlidePageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout containing a title and body text.
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_screen_slide_page, container, false);

        // Set the title view to show the page number.
        ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                getString(R.string.title_template_step, mPageNumber + 1));
        //set the text in each page
        String textz="null";
        switch(mPageNumber+1){
        case 1 :
        	textz ="Problems... cannot be solved by the level of thinking that created them.";
        	break;
        case 2 :
        	textz = "If we knew what we were doing, it wouldn't be called research, would it?" ;
        	break;
        case 3 :
        	textz = "Intellectuals solve problems; geniuses prevent them." ;
        	break;
        case 4 :
        	textz = "Dancers are the athletes of God." ;
        	break;
        case 5 :
        	textz = "I want to know the thoughts of God, the rest are details." ;
        	break;
        case 6 :
        	textz = "Not everything that counts can be counted, and not everything that can be counted counts." ;
        	break;	
        case 7 :
        	textz = "If I had only known, I would have been a locksmith." ;
        	break;
        case 8 :
        	textz = "The search and striving for truth and knowledge is one of the highest of man's qualities." ;
        	break;
        case 9 :
        	textz = "Gravity cannot be held responsible for people falling in love." ;
        	break;
        case 10 :
        	textz = "Whoever undertakes to set himself up as a judge of truth and knowledge is shipwrecked by the laughter of the Gods." ;
        	break;
        case 11 :
        	textz = "An empty stomach is not a good political adviser." ;
        	break;
        case 12 :
        	textz = "The important thing is to not stop questioning." ;
        	break;
        case 13 :
        	textz = "There are two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle." ;
        	break;
        case 14 :
        	textz = "It stands to the everlasting credit of science that by acting on the human mind it has overcome man's insecurity before himself and before nature." ;
        	break;
        case 15 :
        	textz = "The release of atomic energy has not created a new problem. It has merely made more urgent the necessity of solving an existing one." ;
        	break;
        case 16  :
        	textz="If the facts don't fit the theory, change the facts.";
        	break;
        case  17 :
        	textz="Violence sometimes may have cleared away obstructions quickly, but it never has proved itself creative.";
        	break;
        case  18 :
        	textz="Common sense is the collection of prejudices acquired by age eighteen.";
        	break;
        case  19 :
        	textz="If the facts don't fit the theory, then change the facts.";
        	break;
        case  20 :
        	textz="Peace can't be kept by force; it can only be achieved by understanding.";
        	break;
        case  21 :
        	textz="If we knew what it was we were doing, it would not be called research, would it ?";
        	break;
        case  22 :
        	textz="I do not believe in the God of theology who rewards good and punishes evil.";
        	break;
        case  23 :
        	textz="It is more difficult to disintegrate a prejudice than an atom.";
        	break;
        case  24 :
        	textz="Before God we are all equally wise and equally foolish.";
        	break;
        case  25 :
        	textz="Truth is what stands the test of experience.";
        	break;
        case  26 :
        	textz="In the middle of difficulty lies opportunity.";
        	break;
        case  27 :
        	textz="Man usually avoids attributing cleverness to somebody else - unless it is an enemy.";
        	break;
        case  28 :
        	textz="The most beautiful thing we can experience is the mysterious.";
        	break;
        case  29 :
        	textz="Circumstances are stronger than men.";
        	break;
        case  30 :
        	textz="The time is terribly short. We must act now if we are to act at all.";
        	break; 
        case  31 :
        	textz="I never think of the future. It comes soon enough.";
        	break;
        case  32 :
        	textz="If one studies too zealously, one easily loses his pants.";
        	break;
        case  33 :
        	textz="When you are courting a nice girl an hour seems like a second. When you sit on a red-hot cinder a second seems like an hour. That's relativity.";
        	break;
        case  34 :
        	textz="We want peace and we realize that our future development depends on peace.";
        	break;
        case  35 :
        	textz="Science without religion is lame. Religion without science is blind.";
        	break;	
        case  36 :
        	textz="The scientific way of thinking has a further characteristic. The concepts, which it uses to build up its coherent systems, are not expressing emotions.";
        	break;	
        case  37 :
        	textz="The important thing is not to stop questioning.";
        	break;	
        case  38 :
        	textz="It may affront the military-minded person to suggest a regime that does not maintain any military secrets.";
        	break;	
        case  39 :
        	textz="I lived in solitude in the country and noticed how the monotony of a quiet life stimulates the creative mind.";
        	break;
        case  40 :
        	textz="Never do anything against conscience even if the state demands it.";
        	break;	
        case  41 :
        	textz="My political ideal is democracy. Let every man be respected as an individual and no man idolized.";
        	break;	
        case  42 :
        	textz="Only a real risk tests the reality of a belief .";
        	break;	
        case  43 :
        	textz="Unquestioning respect for authority, is the greatest enemy of truth.";
        	break;	
        case  44:
        	textz="Logical thinking is necessarily deductive, it is based upon hypothetical concepts and axioms.";
        	break;	
        	
        case 45:
        	textz="Reality is merely an illusion, albeit a very persistent one";
        	break;	
        case  46:
        	textz="I do not contemplate heaven and hell, you see I have friends in both places.";
        	break;	
        case  47:
        	textz="God may be subtle, but He isn't plain mean.";
        	break;	
        case  48:
        	textz="I am opposed to the use of force under any circumstances, except when confronted by an enemy who pursues the destruction of life as an end in itself.";
        	break;	
        case  49:
        	textz="Imagination is more important than knowledge. Knowledge is limited. Imagination encircles the world.";
        	break;	
        case  50:
        	textz="You cannot simultaneously prevent and prepare for war.";
        	break;	
        case 51:
        	textz="Personalities are not formed by what is heard and said, but by labour and activity.";
        	break;	
        case 52:
        	textz="Moral authority alone is an inadequate means of searching the cease.";
        	break;	
        case  53 :
        	textz="The most incomprehensible thing about the world is that it is at all comprehensible.";
        	break;	
        case  54 :
        	textz="Ethical directives can be made rational and coherent by logical thinking and empirical knowledge.";
        	break;
        case  55:
        	textz="I have no particular talent. I am merely inquisitive.";
        	break; 
        case 56:
        	textz="As far as the laws of mathematics refer to reality, they are not certain; and as far as they are certain, they do not refer to reality.";
        	break;
        case 57:
        	textz="If you are out to describe the truth, leave elegace to the tailor.";
        	break;	
        case 58:
        	textz="Only two things are infinite, the universe and human stupidity, and I'm not sure about the former.";
        	break;	
        case 59:
        	textz="A permanent peace cannot be prepared by threats but only by the honest attempt to create mutual trust.";
        	break;	
        case 60:
        	textz="Try not to become a man of success, but rather try to become a man of value.";
        	break;	
        case 61:
        	textz="When language becomes thus partially independent from the background of impressions, a greater inner coherence is gained.";
        	break;	
        case 62:
        	textz="Thus, we may conclude that the mental development of the individual and his way of forming concepts depend to a high degree upon language. This makes us realize what extent the same language means the same mentality. In this sense thinking and language are linked together.";
        	break;	
        case 63:
        	textz="An education is what you remember, after you have forgotten everything that you've learned.";
        	break;
        case 64:
        	textz="Everything should be made as simple as possible but not simpler.";
        	break;	
        case 65:
        	textz="True religion is real living; living with all ones soul, all ones goodness and righteousness.";
        	break;	
        case 66:
        	textz="We must revolutionize our thinking, revolutionize our actions and must have the courage to revolutionize relations among the nations of the world.";
        	break;	
        case 67:
        	textz="What really interest me is whether God had any choice in the creation of the world.";
        	break;	
        case 68:
        	textz="By painful experience we have learnt that rational thinking does not suffice to solve the problems of our social life.";
        	break;	
        case 69:
        	textz="Weakness of attitude becomes weakness of character.";
        	break;	
        case 70:
        	textz="Great spirits have always encountered violent opposition from mediocre minds.";
        	break;	
        case 71:
        	textz="I know not with what Weapon World War III will be fought, but World War IV will be fought with sticks and stones.";
        	break;
        case 72:
        	textz="Sometimes one pays most for the things one gets for nothing.";
        	break;	
        case 73:
        	textz="The hardest thing in the world to understand is the income tax.Not everything that can be counted counts, and not everything that counts can be counted.";
        	break;	
        case 74:
        	textz="The secret to creativity is knowing how to hide your sources";
        	break;	
        case 75:
        	textz="The value of a man, however, should be seen in what he gives and not in what he is able to receive.";
        	break;	
        case 76:
        	textz="The eternal mystery of the world is its comprehensibility.";
        	break;	
        case 77:
        	textz="The work of statesmen can succeed only if they are backed by the serious and determined will of the people.";
        	break;	
        };
       
        
        ((TextView) rootView.findViewById(android.R.id.text2)).setText(textz);

        return rootView;
    }

    /**
     * Returns the page number represented by this fragment object.
     */
    public int getPageNumber() {
        return mPageNumber;
    }
}
