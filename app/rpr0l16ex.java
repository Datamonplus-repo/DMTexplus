package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rpr0l16ex extends GXProcedure
{
   public rpr0l16ex( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rpr0l16ex.class ), "" );
   }

   public rpr0l16ex( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          java.util.Date[] aP1 ,
                          String[] aP2 ,
                          java.util.Date[] aP3 ,
                          String[] aP4 ,
                          byte[] aP5 ,
                          byte[] aP6 ,
                          int[] aP7 )
   {
      rpr0l16ex.this.aP8 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        int[] aP7 ,
                        int[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             int[] aP7 ,
                             int[] aP8 )
   {
      rpr0l16ex.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rpr0l16ex.this.AV17Pfec = aP1[0];
      this.aP1 = aP1;
      rpr0l16ex.this.AV19Pmaq = aP2[0];
      this.aP2 = aP2;
      rpr0l16ex.this.AV18Ufec = aP3[0];
      this.aP3 = aP3;
      rpr0l16ex.this.AV20Umaq = aP4[0];
      this.aP4 = aP4;
      rpr0l16ex.this.AV55PTurno = aP5[0];
      this.aP5 = aP5;
      rpr0l16ex.this.AV56UTurno = aP6[0];
      this.aP6 = aP6;
      rpr0l16ex.this.AV70PCliCod = aP7[0];
      this.aP7 = aP7;
      rpr0l16ex.this.AV71UCliCod = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = rpr0l16ex.this.A396EmprCod;
      this.aP1[0] = rpr0l16ex.this.AV17Pfec;
      this.aP2[0] = rpr0l16ex.this.AV19Pmaq;
      this.aP3[0] = rpr0l16ex.this.AV18Ufec;
      this.aP4[0] = rpr0l16ex.this.AV20Umaq;
      this.aP5[0] = rpr0l16ex.this.AV55PTurno;
      this.aP6[0] = rpr0l16ex.this.AV56UTurno;
      this.aP7[0] = rpr0l16ex.this.AV70PCliCod;
      this.aP8[0] = rpr0l16ex.this.AV71UCliCod;
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

   private byte AV55PTurno ;
   private byte AV56UTurno ;
   private short Gx_err ;
   private int AV70PCliCod ;
   private int AV71UCliCod ;
   private String A396EmprCod ;
   private String AV19Pmaq ;
   private String AV20Umaq ;
   private java.util.Date AV17Pfec ;
   private java.util.Date AV18Ufec ;
   private int[] aP8 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private String[] aP2 ;
   private java.util.Date[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private int[] aP7 ;
}

