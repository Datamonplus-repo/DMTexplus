package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pparpies extends GXProcedure
{
   public pparpies( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pparpies.class ), "" );
   }

   public pparpies( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            java.math.BigDecimal[] aP3 ,
                            java.math.BigDecimal[] aP4 )
   {
      pparpies.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             short[] aP5 )
   {
      pparpies.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pparpies.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pparpies.this.AV12AlbRecPie1 = aP2[0];
      this.aP2 = aP2;
      pparpies.this.AV13DisPieKil1 = aP3[0];
      this.aP3 = aP3;
      pparpies.this.AV14DisPieMet1 = aP4[0];
      this.aP4 = aP4;
      pparpies.this.AV15DisPieAnc1 = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12AlbRecPie1 = AV8AlbRecPie[1-1] ;
      AV12AlbRecPie1 = AV8AlbRecPie[1-1] ;
      AV13DisPieKil1 = AV9DisPieKil[1-1] ;
      AV14DisPieMet1 = AV10DisPieMet[1-1] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pparpies.this.A396EmprCod;
      this.aP1[0] = pparpies.this.A44AlbRecCod;
      this.aP2[0] = pparpies.this.AV12AlbRecPie1;
      this.aP3[0] = pparpies.this.AV13DisPieKil1;
      this.aP4[0] = pparpies.this.AV14DisPieMet1;
      this.aP5[0] = pparpies.this.AV15DisPieAnc1;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8AlbRecPie = new String[1] ;
      GX_I = 1 ;
      while ( GX_I <= 1 )
      {
         AV8AlbRecPie[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV9DisPieKil = new java.math.BigDecimal[1] ;
      GX_I = 1 ;
      while ( GX_I <= 1 )
      {
         AV9DisPieKil[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV10DisPieMet = new java.math.BigDecimal[1] ;
      GX_I = 1 ;
      while ( GX_I <= 1 )
      {
         AV10DisPieMet[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV15DisPieAnc1 ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int GX_I ;
   private java.math.BigDecimal AV13DisPieKil1 ;
   private java.math.BigDecimal AV14DisPieMet1 ;
   private java.math.BigDecimal AV9DisPieKil[] ;
   private java.math.BigDecimal AV10DisPieMet[] ;
   private String A396EmprCod ;
   private String AV12AlbRecPie1 ;
   private String AV8AlbRecPie[] ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
}

