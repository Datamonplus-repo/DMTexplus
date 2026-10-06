package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpproduccionmaquinasturnos extends GXProcedure
{
   public dpproduccionmaquinasturnos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpproduccionmaquinasturnos.class ), "" );
   }

   public dpproduccionmaquinasturnos( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTProduccionMaquinasTurnos> executeUdp( String aP0 ,
                                                                           String aP1 ,
                                                                           String aP2 ,
                                                                           java.util.Date aP3 ,
                                                                           java.util.Date aP4 )
   {
      dpproduccionmaquinasturnos.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTProduccionMaquinasTurnos>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        GXBaseCollection<app.SdtSDTProduccionMaquinasTurnos>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             GXBaseCollection<app.SdtSDTProduccionMaquinasTurnos>[] aP5 )
   {
      dpproduccionmaquinasturnos.this.AV9Emprcod = aP0;
      dpproduccionmaquinasturnos.this.AV8MaqCodInicial = aP1;
      dpproduccionmaquinasturnos.this.AV7MaqCodFinal = aP2;
      dpproduccionmaquinasturnos.this.AV10Hisprodti = aP3;
      dpproduccionmaquinasturnos.this.AV11HisProdtf = aP4;
      dpproduccionmaquinasturnos.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00152 */
      pr_default.execute(0, new Object[] {AV9Emprcod, AV8MaqCodInicial, AV10Hisprodti, AV11HisProdtf, AV7MaqCodFinal});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk152 = false ;
         A1525HisProKgr = P00152_A1525HisProKgr[0] ;
         A1526HisProMtr = P00152_A1526HisProMtr[0] ;
         A602MaqCod = P00152_A602MaqCod[0] ;
         A396EmprCod = P00152_A396EmprCod[0] ;
         A566HisProTur = P00152_A566HisProTur[0] ;
         A4441HisProDTF = P00152_A4441HisProDTF[0] ;
         n4441HisProDTF = P00152_n4441HisProDTF[0] ;
         A606MaqDsc = P00152_A606MaqDsc[0] ;
         n606MaqDsc = P00152_n606MaqDsc[0] ;
         A558HisProFec = P00152_A558HisProFec[0] ;
         A561HisProLin = P00152_A561HisProLin[0] ;
         A606MaqDsc = P00152_A606MaqDsc[0] ;
         n606MaqDsc = P00152_n606MaqDsc[0] ;
         Gxm1sdtproduccionmaquinasturnos = (app.SdtSDTProduccionMaquinasTurnos)new app.SdtSDTProduccionMaquinasTurnos(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtproduccionmaquinasturnos, 0);
         Gxm1sdtproduccionmaquinasturnos.setgxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc( A606MaqDsc );
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P00152_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P00152_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk152 = false ;
            A1525HisProKgr = P00152_A1525HisProKgr[0] ;
            A1526HisProMtr = P00152_A1526HisProMtr[0] ;
            A566HisProTur = P00152_A566HisProTur[0] ;
            A558HisProFec = P00152_A558HisProFec[0] ;
            A561HisProLin = P00152_A561HisProLin[0] ;
            Gxm3sdtproduccionmaquinasturnos_turnos = (app.SdtSDTProduccionMaquinasTurnos_TurnosItem)new app.SdtSDTProduccionMaquinasTurnos_TurnosItem(remoteHandle, context);
            Gxm1sdtproduccionmaquinasturnos.getgxTv_SdtSDTProduccionMaquinasTurnos_Turnos().add(Gxm3sdtproduccionmaquinasturnos_turnos, 0);
            Gxm3sdtproduccionmaquinasturnos_turnos.setgxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Turno( (byte)(((A566HisProTur==0) ? 9 : A566HisProTur)) );
            AV5Kilos = DecimalUtil.doubleToDec(0) ;
            AV6Metros = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P00152_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P00152_A602MaqCod[0], A602MaqCod) == 0 ) && ( P00152_A566HisProTur[0] == A566HisProTur ) )
            {
               brk152 = false ;
               A1525HisProKgr = P00152_A1525HisProKgr[0] ;
               A1526HisProMtr = P00152_A1526HisProMtr[0] ;
               A558HisProFec = P00152_A558HisProFec[0] ;
               A561HisProLin = P00152_A561HisProLin[0] ;
               AV5Kilos = AV5Kilos.add(A1525HisProKgr) ;
               AV6Metros = AV6Metros.add(A1526HisProMtr) ;
               brk152 = true ;
               pr_default.readNext(0);
            }
            Gxm3sdtproduccionmaquinasturnos_turnos.setgxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno( AV5Kilos );
            Gxm3sdtproduccionmaquinasturnos_turnos.setgxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno( AV6Metros );
            if ( ! brk152 )
            {
               brk152 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk152 )
         {
            brk152 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = dpproduccionmaquinasturnos.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTProduccionMaquinasTurnos>(app.SdtSDTProduccionMaquinasTurnos.class, "SDTProduccionMaquinasTurnos", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00152_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00152_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00152_A602MaqCod = new String[] {""} ;
      P00152_A396EmprCod = new String[] {""} ;
      P00152_A566HisProTur = new byte[1] ;
      P00152_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P00152_n4441HisProDTF = new boolean[] {false} ;
      P00152_A606MaqDsc = new String[] {""} ;
      P00152_n606MaqDsc = new boolean[] {false} ;
      P00152_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00152_A561HisProLin = new int[1] ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A606MaqDsc = "" ;
      A558HisProFec = GXutil.nullDate() ;
      Gxm1sdtproduccionmaquinasturnos = new app.SdtSDTProduccionMaquinasTurnos(remoteHandle, context);
      Gxm3sdtproduccionmaquinasturnos_turnos = new app.SdtSDTProduccionMaquinasTurnos_TurnosItem(remoteHandle, context);
      AV5Kilos = DecimalUtil.ZERO ;
      AV6Metros = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpproduccionmaquinasturnos__default(),
         new Object[] {
             new Object[] {
            P00152_A1525HisProKgr, P00152_A1526HisProMtr, P00152_A602MaqCod, P00152_A396EmprCod, P00152_A566HisProTur, P00152_A4441HisProDTF, P00152_n4441HisProDTF, P00152_A606MaqDsc, P00152_n606MaqDsc, P00152_A558HisProFec,
            P00152_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A566HisProTur ;
   private short Gx_err ;
   private int A561HisProLin ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV5Kilos ;
   private java.math.BigDecimal AV6Metros ;
   private String AV9Emprcod ;
   private String AV8MaqCodInicial ;
   private String AV7MaqCodFinal ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private java.util.Date AV10Hisprodti ;
   private java.util.Date AV11HisProdtf ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean brk152 ;
   private boolean n4441HisProDTF ;
   private boolean n606MaqDsc ;
   private GXBaseCollection<app.SdtSDTProduccionMaquinasTurnos>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P00152_A1525HisProKgr ;
   private java.math.BigDecimal[] P00152_A1526HisProMtr ;
   private String[] P00152_A602MaqCod ;
   private String[] P00152_A396EmprCod ;
   private byte[] P00152_A566HisProTur ;
   private java.util.Date[] P00152_A4441HisProDTF ;
   private boolean[] P00152_n4441HisProDTF ;
   private String[] P00152_A606MaqDsc ;
   private boolean[] P00152_n606MaqDsc ;
   private java.util.Date[] P00152_A558HisProFec ;
   private int[] P00152_A561HisProLin ;
   private GXBaseCollection<app.SdtSDTProduccionMaquinasTurnos> Gxm2rootcol ;
   private app.SdtSDTProduccionMaquinasTurnos Gxm1sdtproduccionmaquinasturnos ;
   private app.SdtSDTProduccionMaquinasTurnos_TurnosItem Gxm3sdtproduccionmaquinasturnos_turnos ;
}

final  class dpproduccionmaquinasturnos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00152", "SELECT T1.HisProKgr, T1.HisProMtr, T1.MaqCod, T1.EmprCod, T1.HisProTur, T1.HisProDTF, T2.MaqDsc, T1.HisProFec, T1.HisProLin FROM (TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProTur ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
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

