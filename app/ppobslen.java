package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppobslen extends GXProcedure
{
   public ppobslen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppobslen.class ), "" );
   }

   public ppobslen( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 )
   {
      ppobslen.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      ppobslen.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppobslen.this.AV12Aui_obs = aP1[0];
      this.aP1 = aP1;
      ppobslen.this.AV13Nlen = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Nlin = (short)(GXutil.gxmlines( AV12Aui_obs, (short)(75))) ;
      AV15i = (short)(1) ;
      while ( AV15i <= AV14Nlin )
      {
         AV16Aud_ob = GXutil.gxgetmli( AV12Aui_obs, AV15i, (short)(75)) ;
         AV17Len_obs = (short)(GXutil.len( AV16Aud_ob)) ;
         if ( AV15i == 1 )
         {
            AV18Num_c = AV17Len_obs ;
         }
         else
         {
            AV18Num_c = (short)(AV18Num_c+AV17Len_obs) ;
         }
         AV15i = (short)(AV15i+1) ;
      }
      Gx_msg = httpContext.getMessage( "&Nlin =", "") + GXutil.str( AV14Nlin, 4, 0) + GXutil.newLine( ) + httpContext.getMessage( "&Num_c=", "") + GXutil.str( AV18Num_c, 4, 0) + GXutil.newLine( ) ;
      AV13Nlen = AV18Num_c ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppobslen.this.A396EmprCod;
      this.aP1[0] = ppobslen.this.AV12Aui_obs;
      this.aP2[0] = ppobslen.this.AV13Nlen;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Aud_ob = "" ;
      Gx_msg = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV13Nlen ;
   private short AV14Nlin ;
   private short AV15i ;
   private short AV17Len_obs ;
   private short AV18Num_c ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV16Aud_ob ;
   private String Gx_msg ;
   private String AV12Aui_obs ;
   private short[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
}

