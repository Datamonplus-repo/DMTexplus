package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpproduccionparosresumen extends GXProcedure
{
   public dpproduccionparosresumen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpproduccionparosresumen.class ), "" );
   }

   public dpproduccionparosresumen( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTProduccionParosResumen> executeUdp( String aP0 ,
                                                                         String aP1 ,
                                                                         String aP2 ,
                                                                         java.util.Date aP3 ,
                                                                         java.util.Date aP4 )
   {
      dpproduccionparosresumen.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTProduccionParosResumen>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        GXBaseCollection<app.SdtSDTProduccionParosResumen>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             GXBaseCollection<app.SdtSDTProduccionParosResumen>[] aP5 )
   {
      dpproduccionparosresumen.this.AV5Emprcod = aP0;
      dpproduccionparosresumen.this.AV9MaqCodInicial = aP1;
      dpproduccionparosresumen.this.AV8MaqCodFinal = aP2;
      dpproduccionparosresumen.this.AV7Hisprodti = aP3;
      dpproduccionparosresumen.this.AV6Hisprodtf = aP4;
      dpproduccionparosresumen.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001A2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV9MaqCodInicial, AV7Hisprodti, AV6Hisprodtf, AV8MaqCodFinal});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1A2 = false ;
         A396EmprCod = P001A2_A396EmprCod[0] ;
         A602MaqCod = P001A2_A602MaqCod[0] ;
         A656ParCod = P001A2_A656ParCod[0] ;
         n656ParCod = P001A2_n656ParCod[0] ;
         A867ParCodNom = P001A2_A867ParCodNom[0] ;
         n867ParCodNom = P001A2_n867ParCodNom[0] ;
         A606MaqDsc = P001A2_A606MaqDsc[0] ;
         n606MaqDsc = P001A2_n606MaqDsc[0] ;
         A4440HisProDTI = P001A2_A4440HisProDTI[0] ;
         n4440HisProDTI = P001A2_n4440HisProDTI[0] ;
         A4441HisProDTF = P001A2_A4441HisProDTF[0] ;
         n4441HisProDTF = P001A2_n4441HisProDTF[0] ;
         A558HisProFec = P001A2_A558HisProFec[0] ;
         A561HisProLin = P001A2_A561HisProLin[0] ;
         A606MaqDsc = P001A2_A606MaqDsc[0] ;
         n606MaqDsc = P001A2_n606MaqDsc[0] ;
         A867ParCodNom = P001A2_A867ParCodNom[0] ;
         n867ParCodNom = P001A2_n867ParCodNom[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         Gxm1sdtproduccionparosresumen = (app.SdtSDTProduccionParosResumen)new app.SdtSDTProduccionParosResumen(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtproduccionparosresumen, 0);
         Gxm1sdtproduccionparosresumen.setgxTv_SdtSDTProduccionParosResumen_Maqcod( A602MaqCod );
         Gxm1sdtproduccionparosresumen.setgxTv_SdtSDTProduccionParosResumen_Maqdsc( A606MaqDsc );
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001A2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P001A2_A602MaqCod[0], A602MaqCod) == 0 ) && ( P001A2_A656ParCod[0] == A656ParCod ) )
         {
            brk1A2 = false ;
            A867ParCodNom = P001A2_A867ParCodNom[0] ;
            n867ParCodNom = P001A2_n867ParCodNom[0] ;
            A4440HisProDTI = P001A2_A4440HisProDTI[0] ;
            n4440HisProDTI = P001A2_n4440HisProDTI[0] ;
            A4441HisProDTF = P001A2_A4441HisProDTF[0] ;
            n4441HisProDTF = P001A2_n4441HisProDTF[0] ;
            A558HisProFec = P001A2_A558HisProFec[0] ;
            A561HisProLin = P001A2_A561HisProLin[0] ;
            A867ParCodNom = P001A2_A867ParCodNom[0] ;
            n867ParCodNom = P001A2_n867ParCodNom[0] ;
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
            {
               A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            }
            else
            {
               A5605HisProTr2 = (short)(0) ;
            }
            Gxm3sdtproduccionparosresumen_paros = (app.SdtSDTProduccionParosResumen_ParosItem)new app.SdtSDTProduccionParosResumen_ParosItem(remoteHandle, context);
            Gxm1sdtproduccionparosresumen.getgxTv_SdtSDTProduccionParosResumen_Paros().add(Gxm3sdtproduccionparosresumen_paros, 0);
            Gxm3sdtproduccionparosresumen_paros.setgxTv_SdtSDTProduccionParosResumen_ParosItem_Parcod( A656ParCod );
            Gxm3sdtproduccionparosresumen_paros.setgxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom( A867ParCodNom );
            Gxm4sdtproduccionparosresumen_paros_repeticiones = (app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem)new app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem(remoteHandle, context);
            Gxm3sdtproduccionparosresumen_paros.getgxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones().add(Gxm4sdtproduccionparosresumen_paros_repeticiones, 0);
            AV10NumeroParos = 0 ;
            AV11TiempoParos = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001A2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P001A2_A602MaqCod[0], A602MaqCod) == 0 ) && ( P001A2_A656ParCod[0] == A656ParCod ) )
            {
               brk1A2 = false ;
               A4440HisProDTI = P001A2_A4440HisProDTI[0] ;
               n4440HisProDTI = P001A2_n4440HisProDTI[0] ;
               A4441HisProDTF = P001A2_A4441HisProDTF[0] ;
               n4441HisProDTF = P001A2_n4441HisProDTF[0] ;
               A558HisProFec = P001A2_A558HisProFec[0] ;
               A561HisProLin = P001A2_A561HisProLin[0] ;
               if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
               {
                  A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
               }
               else
               {
                  A5605HisProTr2 = (short)(0) ;
               }
               AV10NumeroParos = (int)(AV10NumeroParos+1) ;
               AV11TiempoParos = (int)(AV11TiempoParos+A5605HisProTr2) ;
               brk1A2 = true ;
               pr_default.readNext(0);
            }
            AV16HorRea = (short)(AV11TiempoParos/ (double) (60)) ;
            AV12HorReaint = (short)(GXutil.Int( AV16HorRea)) ;
            AV13MinRea = (short)(AV11TiempoParos-(AV12HorReaint*60)) ;
            AV14MinRea2 = DecimalUtil.doubleToDec(AV13MinRea/ (double) (100)) ;
            AV15TParo = DecimalUtil.doubleToDec(AV12HorReaint).add(AV14MinRea2) ;
            Gxm4sdtproduccionparosresumen_paros_repeticiones.setgxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Numeroparos( (short)(AV10NumeroParos) );
            Gxm4sdtproduccionparosresumen_paros_repeticiones.setgxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Tiempoparos( AV11TiempoParos );
            Gxm4sdtproduccionparosresumen_paros_repeticiones.setgxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos( AV15TParo );
            if ( ! brk1A2 )
            {
               brk1A2 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk1A2 )
         {
            brk1A2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = dpproduccionparosresumen.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(0);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTProduccionParosResumen>(app.SdtSDTProduccionParosResumen.class, "SDTProduccionParosResumen", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P001A2_A396EmprCod = new String[] {""} ;
      P001A2_A602MaqCod = new String[] {""} ;
      P001A2_A656ParCod = new short[1] ;
      P001A2_n656ParCod = new boolean[] {false} ;
      P001A2_A867ParCodNom = new String[] {""} ;
      P001A2_n867ParCodNom = new boolean[] {false} ;
      P001A2_A606MaqDsc = new String[] {""} ;
      P001A2_n606MaqDsc = new boolean[] {false} ;
      P001A2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P001A2_n4440HisProDTI = new boolean[] {false} ;
      P001A2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P001A2_n4441HisProDTF = new boolean[] {false} ;
      P001A2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P001A2_A561HisProLin = new int[1] ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A867ParCodNom = "" ;
      A606MaqDsc = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      Gxm1sdtproduccionparosresumen = new app.SdtSDTProduccionParosResumen(remoteHandle, context);
      Gxm3sdtproduccionparosresumen_paros = new app.SdtSDTProduccionParosResumen_ParosItem(remoteHandle, context);
      Gxm4sdtproduccionparosresumen_paros_repeticiones = new app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem(remoteHandle, context);
      AV14MinRea2 = DecimalUtil.ZERO ;
      AV15TParo = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpproduccionparosresumen__default(),
         new Object[] {
             new Object[] {
            P001A2_A396EmprCod, P001A2_A602MaqCod, P001A2_A656ParCod, P001A2_n656ParCod, P001A2_A867ParCodNom, P001A2_n867ParCodNom, P001A2_A606MaqDsc, P001A2_n606MaqDsc, P001A2_A4440HisProDTI, P001A2_n4440HisProDTI,
            P001A2_A4441HisProDTF, P001A2_n4441HisProDTF, P001A2_A558HisProFec, P001A2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short AV16HorRea ;
   private short AV12HorReaint ;
   private short AV13MinRea ;
   private short Gx_err ;
   private int A561HisProLin ;
   private int AV10NumeroParos ;
   private int AV11TiempoParos ;
   private java.math.BigDecimal AV14MinRea2 ;
   private java.math.BigDecimal AV15TParo ;
   private String AV5Emprcod ;
   private String AV9MaqCodInicial ;
   private String AV8MaqCodFinal ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A867ParCodNom ;
   private String A606MaqDsc ;
   private java.util.Date AV7Hisprodti ;
   private java.util.Date AV6Hisprodtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean brk1A2 ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n606MaqDsc ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private GXBaseCollection<app.SdtSDTProduccionParosResumen>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P001A2_A396EmprCod ;
   private String[] P001A2_A602MaqCod ;
   private short[] P001A2_A656ParCod ;
   private boolean[] P001A2_n656ParCod ;
   private String[] P001A2_A867ParCodNom ;
   private boolean[] P001A2_n867ParCodNom ;
   private String[] P001A2_A606MaqDsc ;
   private boolean[] P001A2_n606MaqDsc ;
   private java.util.Date[] P001A2_A4440HisProDTI ;
   private boolean[] P001A2_n4440HisProDTI ;
   private java.util.Date[] P001A2_A4441HisProDTF ;
   private boolean[] P001A2_n4441HisProDTF ;
   private java.util.Date[] P001A2_A558HisProFec ;
   private int[] P001A2_A561HisProLin ;
   private GXBaseCollection<app.SdtSDTProduccionParosResumen> Gxm2rootcol ;
   private app.SdtSDTProduccionParosResumen Gxm1sdtproduccionparosresumen ;
   private app.SdtSDTProduccionParosResumen_ParosItem Gxm3sdtproduccionparosresumen_paros ;
   private app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem Gxm4sdtproduccionparosresumen_paros_repeticiones ;
}

final  class dpproduccionparosresumen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001A2", "SELECT T1.EmprCod, T1.MaqCod, T1.ParCod, T3.ParCodNom, T2.MaqDsc, T1.HisProDTI, T1.HisProDTF, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ? and T1.ParCod > 0) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(8);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

