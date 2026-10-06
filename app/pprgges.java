package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprgges extends GXProcedure
{
   public pprgges( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprgges.class ), "" );
   }

   public pprgges( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pprgges.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pprgges.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      pprgges.this.AV9CliCod = aP1[0];
      this.aP1 = aP1;
      pprgges.this.AV10DisArtCod = aP2[0];
      this.aP2 = aP2;
      pprgges.this.AV11DisColNom = aP3[0];
      this.aP3 = aP3;
      pprgges.this.AV12DisColNum = aP4[0];
      this.aP4 = aP4;
      pprgges.this.AV13DisTipCol = aP5[0];
      this.aP5 = aP5;
      pprgges.this.AV14MaqCodDis = aP6[0];
      this.aP6 = aP6;
      pprgges.this.AV15MacProdsc2 = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15MacProdsc2 = "" ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprgges.this.AV8EmprCod;
      this.aP1[0] = pprgges.this.AV9CliCod;
      this.aP2[0] = pprgges.this.AV10DisArtCod;
      this.aP3[0] = pprgges.this.AV11DisColNom;
      this.aP4[0] = pprgges.this.AV12DisColNum;
      this.aP5[0] = pprgges.this.AV13DisTipCol;
      this.aP6[0] = pprgges.this.AV14MaqCodDis;
      this.aP7[0] = pprgges.this.AV15MacProdsc2;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13DisTipCol ;
   private short Gx_err ;
   private int AV9CliCod ;
   private int AV12DisColNum ;
   private String AV8EmprCod ;
   private String AV10DisArtCod ;
   private String AV11DisColNom ;
   private String AV14MaqCodDis ;
   private String AV15MacProdsc2 ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
}

