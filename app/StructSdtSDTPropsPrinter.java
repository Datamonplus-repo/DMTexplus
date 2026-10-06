package app ;
import com.genexus.*;

public final  class StructSdtSDTPropsPrinter implements Cloneable, java.io.Serializable
{
   public StructSdtSDTPropsPrinter( )
   {
      this( -1, new ModelContext( StructSdtSDTPropsPrinter.class ));
   }

   public StructSdtSDTPropsPrinter( int remoteHandle ,
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

   public byte getCopies( )
   {
      return gxTv_SdtSDTPropsPrinter_Copies ;
   }

   public void setCopies( byte value )
   {
      gxTv_SdtSDTPropsPrinter_N = (byte)(0) ;
      gxTv_SdtSDTPropsPrinter_Copies = value ;
   }

   public boolean getColor( )
   {
      return gxTv_SdtSDTPropsPrinter_Color ;
   }

   public void setColor( boolean value )
   {
      gxTv_SdtSDTPropsPrinter_N = (byte)(0) ;
      gxTv_SdtSDTPropsPrinter_Color = value ;
   }

   public boolean getLandscape( )
   {
      return gxTv_SdtSDTPropsPrinter_Landscape ;
   }

   public void setLandscape( boolean value )
   {
      gxTv_SdtSDTPropsPrinter_N = (byte)(0) ;
      gxTv_SdtSDTPropsPrinter_Landscape = value ;
   }

   protected byte gxTv_SdtSDTPropsPrinter_Copies ;
   protected byte gxTv_SdtSDTPropsPrinter_N ;
   protected boolean gxTv_SdtSDTPropsPrinter_Color ;
   protected boolean gxTv_SdtSDTPropsPrinter_Landscape ;
}

