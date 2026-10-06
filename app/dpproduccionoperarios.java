package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpproduccionoperarios extends GXProcedure
{
   public dpproduccionoperarios( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpproduccionoperarios.class ), "" );
   }

   public dpproduccionoperarios( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTOperarios> executeUdp( String aP0 ,
                                                            String aP1 ,
                                                            String aP2 ,
                                                            java.util.Date aP3 ,
                                                            java.util.Date aP4 )
   {
      dpproduccionoperarios.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTOperarios>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        GXBaseCollection<app.SdtSDTOperarios>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             GXBaseCollection<app.SdtSDTOperarios>[] aP5 )
   {
      dpproduccionoperarios.this.AV10Emprcod = aP0;
      dpproduccionoperarios.this.AV9MaqCodInicial = aP1;
      dpproduccionoperarios.this.AV8MaqCodFinal = aP2;
      dpproduccionoperarios.this.AV7Hisprodti = aP3;
      dpproduccionoperarios.this.AV6HisProdtf = aP4;
      dpproduccionoperarios.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001C2 */
      pr_default.execute(0, new Object[] {AV10Emprcod, AV9MaqCodInicial, AV8MaqCodFinal, AV7Hisprodti, AV6HisProdtf});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1C2 = false ;
         A503GruOpeCod = P001C2_A503GruOpeCod[0] ;
         A396EmprCod = P001C2_A396EmprCod[0] ;
         A1525HisProKgr = P001C2_A1525HisProKgr[0] ;
         A1526HisProMtr = P001C2_A1526HisProMtr[0] ;
         A656ParCod = P001C2_A656ParCod[0] ;
         n656ParCod = P001C2_n656ParCod[0] ;
         A4441HisProDTF = P001C2_A4441HisProDTF[0] ;
         n4441HisProDTF = P001C2_n4441HisProDTF[0] ;
         A602MaqCod = P001C2_A602MaqCod[0] ;
         A558HisProFec = P001C2_A558HisProFec[0] ;
         A561HisProLin = P001C2_A561HisProLin[0] ;
         Gxm1sdtoperarios = (app.SdtSDTOperarios)new app.SdtSDTOperarios(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtoperarios, 0);
         Gxm1sdtoperarios.setgxTv_SdtSDTOperarios_Opecod( A503GruOpeCod );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( AV10Emprcod, A503GruOpeCod, GXv_char2) ;
         dpproduccionoperarios.this.GXt_char1 = GXv_char2[0] ;
         Gxm1sdtoperarios.setgxTv_SdtSDTOperarios_Openom( GXt_char1 );
         AV11Kilos = DecimalUtil.doubleToDec(0) ;
         AV12Metros = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001C2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P001C2_A503GruOpeCod[0] == A503GruOpeCod ) )
         {
            brk1C2 = false ;
            A1525HisProKgr = P001C2_A1525HisProKgr[0] ;
            A1526HisProMtr = P001C2_A1526HisProMtr[0] ;
            A602MaqCod = P001C2_A602MaqCod[0] ;
            A558HisProFec = P001C2_A558HisProFec[0] ;
            A561HisProLin = P001C2_A561HisProLin[0] ;
            AV11Kilos = AV11Kilos.add(A1525HisProKgr) ;
            AV12Metros = AV12Metros.add(A1526HisProMtr) ;
            brk1C2 = true ;
            pr_default.readNext(0);
         }
         Gxm1sdtoperarios.setgxTv_SdtSDTOperarios_Kilosproduccion( AV11Kilos );
         Gxm1sdtoperarios.setgxTv_SdtSDTOperarios_Metrosproduccion( AV12Metros );
         if ( ! brk1C2 )
         {
            brk1C2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = dpproduccionoperarios.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTOperarios>(app.SdtSDTOperarios.class, "SDTOperarios", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P001C2_A503GruOpeCod = new int[1] ;
      P001C2_A396EmprCod = new String[] {""} ;
      P001C2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001C2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001C2_A656ParCod = new short[1] ;
      P001C2_n656ParCod = new boolean[] {false} ;
      P001C2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P001C2_n4441HisProDTF = new boolean[] {false} ;
      P001C2_A602MaqCod = new String[] {""} ;
      P001C2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P001C2_A561HisProLin = new int[1] ;
      A396EmprCod = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      Gxm1sdtoperarios = new app.SdtSDTOperarios(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11Kilos = DecimalUtil.ZERO ;
      AV12Metros = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpproduccionoperarios__default(),
         new Object[] {
             new Object[] {
            P001C2_A503GruOpeCod, P001C2_A396EmprCod, P001C2_A1525HisProKgr, P001C2_A1526HisProMtr, P001C2_A656ParCod, P001C2_n656ParCod, P001C2_A4441HisProDTF, P001C2_n4441HisProDTF, P001C2_A602MaqCod, P001C2_A558HisProFec,
            P001C2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A656ParCod ;
   private short Gx_err ;
   private int A503GruOpeCod ;
   private int A561HisProLin ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV11Kilos ;
   private java.math.BigDecimal AV12Metros ;
   private String AV10Emprcod ;
   private String AV9MaqCodInicial ;
   private String AV8MaqCodFinal ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV7Hisprodti ;
   private java.util.Date AV6HisProdtf ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean brk1C2 ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private GXBaseCollection<app.SdtSDTOperarios>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private int[] P001C2_A503GruOpeCod ;
   private String[] P001C2_A396EmprCod ;
   private java.math.BigDecimal[] P001C2_A1525HisProKgr ;
   private java.math.BigDecimal[] P001C2_A1526HisProMtr ;
   private short[] P001C2_A656ParCod ;
   private boolean[] P001C2_n656ParCod ;
   private java.util.Date[] P001C2_A4441HisProDTF ;
   private boolean[] P001C2_n4441HisProDTF ;
   private String[] P001C2_A602MaqCod ;
   private java.util.Date[] P001C2_A558HisProFec ;
   private int[] P001C2_A561HisProLin ;
   private GXBaseCollection<app.SdtSDTOperarios> Gxm2rootcol ;
   private app.SdtSDTOperarios Gxm1sdtoperarios ;
}

final  class dpproduccionoperarios__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001C2", "SELECT GruOpeCod, EmprCod, HisProKgr, HisProMtr, ParCod, HisProDTF, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE (EmprCod = ?) AND (MaqCod >= ?) AND (MaqCod <= ?) AND (HisProDTF >= ?) AND (HisProDTF <= ?) AND (ParCod = 0) ORDER BY EmprCod, GruOpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
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
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               return;
      }
   }

}

