package app ;
import com.genexus.*;

public final  class StructSdtAppTool implements Cloneable, java.io.Serializable
{
   public StructSdtAppTool( )
   {
      this( -1, new ModelContext( StructSdtAppTool.class ));
   }

   public StructSdtAppTool( int remoteHandle ,
                            ModelContext context )
   {
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

}

