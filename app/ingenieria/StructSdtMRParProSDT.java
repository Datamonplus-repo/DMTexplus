package app.ingenieria ;
import com.genexus.*;

public final  class StructSdtMRParProSDT implements Cloneable, java.io.Serializable
{
   public StructSdtMRParProSDT( )
   {
      this( -1, new ModelContext( StructSdtMRParProSDT.class ));
   }

   public StructSdtMRParProSDT( int remoteHandle ,
                                ModelContext context )
   {
      gxTv_SdtMRParProSDT_Mrparprdsc = "" ;
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

   public long getMrparprid( )
   {
      return gxTv_SdtMRParProSDT_Mrparprid ;
   }

   public void setMrparprid( long value )
   {
      gxTv_SdtMRParProSDT_N = (byte)(0) ;
      gxTv_SdtMRParProSDT_Mrparprid = value ;
   }

   public String getMrparprdsc( )
   {
      return gxTv_SdtMRParProSDT_Mrparprdsc ;
   }

   public void setMrparprdsc( String value )
   {
      gxTv_SdtMRParProSDT_N = (byte)(0) ;
      gxTv_SdtMRParProSDT_Mrparprdsc = value ;
   }

   protected byte gxTv_SdtMRParProSDT_N ;
   protected long gxTv_SdtMRParProSDT_Mrparprid ;
   protected String gxTv_SdtMRParProSDT_Mrparprdsc ;
}

