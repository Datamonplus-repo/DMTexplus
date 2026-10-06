package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpinformecomprasmes extends GXProcedure
{
   public dpinformecomprasmes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpinformecomprasmes.class ), "" );
   }

   public dpinformecomprasmes( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTInformeComprasMes> executeUdp( String aP0 ,
                                                                    String aP1 ,
                                                                    String aP2 ,
                                                                    int aP3 ,
                                                                    int aP4 ,
                                                                    short aP5 )
   {
      dpinformecomprasmes.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTInformeComprasMes>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        int aP4 ,
                        short aP5 ,
                        GXBaseCollection<app.SdtSDTInformeComprasMes>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             int aP4 ,
                             short aP5 ,
                             GXBaseCollection<app.SdtSDTInformeComprasMes>[] aP6 )
   {
      dpinformecomprasmes.this.AV6Emprcod = aP0;
      dpinformecomprasmes.this.AV5Prdnum = aP1;
      dpinformecomprasmes.this.AV7Prdnum_to = aP2;
      dpinformecomprasmes.this.AV8PrvNum = aP3;
      dpinformecomprasmes.this.AV9PrvNum_to = aP4;
      dpinformecomprasmes.this.AV10Anyo = aP5;
      dpinformecomprasmes.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001I2 */
      pr_default.execute(0, new Object[] {AV6Emprcod, AV5Prdnum, Short.valueOf(AV10Anyo), Integer.valueOf(AV8PrvNum), Integer.valueOf(AV9PrvNum_to), AV7Prdnum_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1I2 = false ;
         A8360PrdProv = P001I2_A8360PrdProv[0] ;
         A8366PrdAnyo = P001I2_A8366PrdAnyo[0] ;
         A719PrdNum = P001I2_A719PrdNum[0] ;
         A396EmprCod = P001I2_A396EmprCod[0] ;
         A8363PrdMesL = P001I2_A8363PrdMesL[0] ;
         A8364PrdUndCpM = P001I2_A8364PrdUndCpM[0] ;
         A8365PrdUndCnM = P001I2_A8365PrdUndCnM[0] ;
         A718PrdNom = P001I2_A718PrdNom[0] ;
         A718PrdNom = P001I2_A718PrdNom[0] ;
         Gxm1sdtinformecomprasmes = (app.SdtSDTInformeComprasMes)new app.SdtSDTInformeComprasMes(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtinformecomprasmes, 0);
         Gxm1sdtinformecomprasmes.setgxTv_SdtSDTInformeComprasMes_Producto( A719PrdNum );
         Gxm1sdtinformecomprasmes.setgxTv_SdtSDTInformeComprasMes_Descripcion( A718PrdNom );
         Gxm1sdtinformecomprasmes.setgxTv_SdtSDTInformeComprasMes_Proveedor( A8360PrdProv );
         GXt_char1 = "" ;
         GXv_char2[0] = AV6Emprcod ;
         GXv_int3[0] = A8360PrdProv ;
         GXv_char4[0] = GXt_char1 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
         dpinformecomprasmes.this.AV6Emprcod = GXv_char2[0] ;
         dpinformecomprasmes.this.A8360PrdProv = GXv_int3[0] ;
         dpinformecomprasmes.this.GXt_char1 = GXv_char4[0] ;
         Gxm1sdtinformecomprasmes.setgxTv_SdtSDTInformeComprasMes_Nombre( GXt_char1 );
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001I2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P001I2_A719PrdNum[0], A719PrdNum) == 0 ) && ( P001I2_A8366PrdAnyo[0] == A8366PrdAnyo ) && ( P001I2_A8360PrdProv[0] == A8360PrdProv ) )
         {
            if ( ! ( ( P001I2_A8363PrdMesL[0] == A8363PrdMesL ) ) )
            {
               if (true) break;
            }
            brk1I2 = false ;
            A8364PrdUndCpM = P001I2_A8364PrdUndCpM[0] ;
            A8365PrdUndCnM = P001I2_A8365PrdUndCnM[0] ;
            Gxm3sdtinformecomprasmes_meses = (app.SdtSDTInformeComprasMes_MesesItem)new app.SdtSDTInformeComprasMes_MesesItem(remoteHandle, context);
            Gxm1sdtinformecomprasmes.getgxTv_SdtSDTInformeComprasMes_Meses().add(Gxm3sdtinformecomprasmes_meses, 0);
            Gxm3sdtinformecomprasmes_meses.setgxTv_SdtSDTInformeComprasMes_MesesItem_Mes( A8363PrdMesL );
            Gxm3sdtinformecomprasmes_meses.setgxTv_SdtSDTInformeComprasMes_MesesItem_Compras( A8364PrdUndCpM );
            Gxm3sdtinformecomprasmes_meses.setgxTv_SdtSDTInformeComprasMes_MesesItem_Valorcompras( A8365PrdUndCnM );
            brk1I2 = true ;
            pr_default.readNext(0);
         }
         if ( ! brk1I2 )
         {
            brk1I2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = dpinformecomprasmes.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTInformeComprasMes>(app.SdtSDTInformeComprasMes.class, "SDTInformeComprasMes", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P001I2_A8360PrdProv = new int[1] ;
      P001I2_A8366PrdAnyo = new short[1] ;
      P001I2_A719PrdNum = new String[] {""} ;
      P001I2_A396EmprCod = new String[] {""} ;
      P001I2_A8363PrdMesL = new byte[1] ;
      P001I2_A8364PrdUndCpM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001I2_A8365PrdUndCnM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001I2_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A8364PrdUndCpM = DecimalUtil.ZERO ;
      A8365PrdUndCnM = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      Gxm1sdtinformecomprasmes = new app.SdtSDTInformeComprasMes(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      Gxm3sdtinformecomprasmes_meses = new app.SdtSDTInformeComprasMes_MesesItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpinformecomprasmes__default(),
         new Object[] {
             new Object[] {
            P001I2_A8360PrdProv, P001I2_A8366PrdAnyo, P001I2_A719PrdNum, P001I2_A396EmprCod, P001I2_A8363PrdMesL, P001I2_A8364PrdUndCpM, P001I2_A8365PrdUndCnM, P001I2_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A8363PrdMesL ;
   private short AV10Anyo ;
   private short A8366PrdAnyo ;
   private short Gx_err ;
   private int AV8PrvNum ;
   private int AV9PrvNum_to ;
   private int A8360PrdProv ;
   private int GXv_int3[] ;
   private java.math.BigDecimal A8364PrdUndCpM ;
   private java.math.BigDecimal A8365PrdUndCnM ;
   private String AV6Emprcod ;
   private String AV5Prdnum ;
   private String AV7Prdnum_to ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private boolean brk1I2 ;
   private GXBaseCollection<app.SdtSDTInformeComprasMes>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private int[] P001I2_A8360PrdProv ;
   private short[] P001I2_A8366PrdAnyo ;
   private String[] P001I2_A719PrdNum ;
   private String[] P001I2_A396EmprCod ;
   private byte[] P001I2_A8363PrdMesL ;
   private java.math.BigDecimal[] P001I2_A8364PrdUndCpM ;
   private java.math.BigDecimal[] P001I2_A8365PrdUndCnM ;
   private String[] P001I2_A718PrdNom ;
   private GXBaseCollection<app.SdtSDTInformeComprasMes> Gxm2rootcol ;
   private app.SdtSDTInformeComprasMes Gxm1sdtinformecomprasmes ;
   private app.SdtSDTInformeComprasMes_MesesItem Gxm3sdtinformecomprasmes_meses ;
}

final  class dpinformecomprasmes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001I2", "SELECT T1.PrdProv, T1.PrdAnyo, T1.PrdNum, T1.EmprCod, T1.PrdMesL, T1.PrdUndCpM, T1.PrdUndCnM, T2.PrdNom FROM (TXPINSES1 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.PrdNum >= ? and T1.PrdAnyo = ? and T1.PrdProv >= ?) AND (T1.PrdProv <= ?) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdAnyo, T1.PrdProv, T1.PrdMesL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 6);
               return;
      }
   }

}

