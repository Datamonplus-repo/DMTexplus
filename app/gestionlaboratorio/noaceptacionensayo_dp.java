package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class noaceptacionensayo_dp extends GXProcedure
{
   public noaceptacionensayo_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( noaceptacionensayo_dp.class ), "" );
   }

   public noaceptacionensayo_dp( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item> executeUdp( String aP0 ,
                                                                                              int aP1 )
   {
      noaceptacionensayo_dp.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        GXBaseCollection<app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             GXBaseCollection<app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item>[] aP2 )
   {
      noaceptacionensayo_dp.this.AV5Emprcod = aP0;
      noaceptacionensayo_dp.this.AV6Lb_Numero = aP1;
      noaceptacionensayo_dp.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00492 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6Lb_Numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P00492_A396EmprCod[0] ;
         A5532Lb_numero = P00492_A5532Lb_numero[0] ;
         A5566Lb_Estado = P00492_A5566Lb_Estado[0] ;
         A5555Lb_opcion = P00492_A5555Lb_opcion[0] ;
         A5536Lb_ColNom = P00492_A5536Lb_ColNom[0] ;
         A5537Lb_ColNum = P00492_A5537Lb_ColNum[0] ;
         A252CliCod = P00492_A252CliCod[0] ;
         A279CliNom = P00492_A279CliNom[0] ;
         A5540Lb_Cartaz = P00492_A5540Lb_Cartaz[0] ;
         A5594Lb_cartazf = P00492_A5594Lb_cartazf[0] ;
         A5567Lb_FechaEn = P00492_A5567Lb_FechaEn[0] ;
         A5563Lb_FechaR = P00492_A5563Lb_FechaR[0] ;
         A6461Lb_FecNoa1 = P00492_A6461Lb_FecNoa1[0] ;
         A10082Lb_hhnoa1 = P00492_A10082Lb_hhnoa1[0] ;
         A5536Lb_ColNom = P00492_A5536Lb_ColNom[0] ;
         A5537Lb_ColNum = P00492_A5537Lb_ColNum[0] ;
         A252CliCod = P00492_A252CliCod[0] ;
         A5540Lb_Cartaz = P00492_A5540Lb_Cartaz[0] ;
         A5594Lb_cartazf = P00492_A5594Lb_cartazf[0] ;
         A279CliNom = P00492_A279CliNom[0] ;
         Gxm1noaceptacionensayo_sdt = (app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)new app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1noaceptacionensayo_sdt, 0);
         Gxm1noaceptacionensayo_sdt.setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar( true );
         Gxm1noaceptacionensayo_sdt.setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero( A5532Lb_numero );
         Gxm1noaceptacionensayo_sdt.setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion( A5555Lb_opcion );
         Gxm1noaceptacionensayo_sdt.setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom( A5536Lb_ColNom );
         Gxm1noaceptacionensayo_sdt.setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum( A5537Lb_ColNum );
         Gxm1noaceptacionensayo_sdt.setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod( A252CliCod );
         Gxm1noaceptacionensayo_sdt.setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom( A279CliNom );
         Gxm1noaceptacionensayo_sdt.setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz( A5540Lb_Cartaz );
         Gxm1noaceptacionensayo_sdt.setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf( A5594Lb_cartazf );
         Gxm1noaceptacionensayo_sdt.setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen( A5567Lb_FechaEn );
         Gxm1noaceptacionensayo_sdt.setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar( A5563Lb_FechaR );
         Gxm1noaceptacionensayo_sdt.setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado( A5566Lb_Estado );
         Gxm1noaceptacionensayo_sdt.setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1( A6461Lb_FecNoa1 );
         Gxm1noaceptacionensayo_sdt.setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1( A10082Lb_hhnoa1 );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = noaceptacionensayo_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item>(app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00492_A396EmprCod = new String[] {""} ;
      P00492_A5532Lb_numero = new int[1] ;
      P00492_A5566Lb_Estado = new byte[1] ;
      P00492_A5555Lb_opcion = new String[] {""} ;
      P00492_A5536Lb_ColNom = new String[] {""} ;
      P00492_A5537Lb_ColNum = new int[1] ;
      P00492_A252CliCod = new int[1] ;
      P00492_A279CliNom = new String[] {""} ;
      P00492_A5540Lb_Cartaz = new String[] {""} ;
      P00492_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P00492_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P00492_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P00492_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P00492_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A5555Lb_opcion = "" ;
      A5536Lb_ColNom = "" ;
      A279CliNom = "" ;
      A5540Lb_Cartaz = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      Gxm1noaceptacionensayo_sdt = new app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.noaceptacionensayo_dp__default(),
         new Object[] {
             new Object[] {
            P00492_A396EmprCod, P00492_A5532Lb_numero, P00492_A5566Lb_Estado, P00492_A5555Lb_opcion, P00492_A5536Lb_ColNom, P00492_A5537Lb_ColNum, P00492_A252CliCod, P00492_A279CliNom, P00492_A5540Lb_Cartaz, P00492_A5594Lb_cartazf,
            P00492_A5567Lb_FechaEn, P00492_A5563Lb_FechaR, P00492_A6461Lb_FecNoa1, P00492_A10082Lb_hhnoa1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5566Lb_Estado ;
   private short Gx_err ;
   private int AV6Lb_Numero ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private String AV5Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
   private String A5540Lb_Cartaz ;
   private java.util.Date A10082Lb_hhnoa1 ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private GXBaseCollection<app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00492_A396EmprCod ;
   private int[] P00492_A5532Lb_numero ;
   private byte[] P00492_A5566Lb_Estado ;
   private String[] P00492_A5555Lb_opcion ;
   private String[] P00492_A5536Lb_ColNom ;
   private int[] P00492_A5537Lb_ColNum ;
   private int[] P00492_A252CliCod ;
   private String[] P00492_A279CliNom ;
   private String[] P00492_A5540Lb_Cartaz ;
   private java.util.Date[] P00492_A5594Lb_cartazf ;
   private java.util.Date[] P00492_A5567Lb_FechaEn ;
   private java.util.Date[] P00492_A5563Lb_FechaR ;
   private java.util.Date[] P00492_A6461Lb_FecNoa1 ;
   private java.util.Date[] P00492_A10082Lb_hhnoa1 ;
   private GXBaseCollection<app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item> Gxm2rootcol ;
   private app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item Gxm1noaceptacionensayo_sdt ;
}

final  class noaceptacionensayo_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00492", "SELECT T1.EmprCod, T1.Lb_numero, T1.Lb_Estado, T1.Lb_opcion, T2.Lb_ColNom, T2.Lb_ColNum, T2.CliCod, T3.CliNom, T2.Lb_Cartaz, T2.Lb_cartazf, T1.Lb_FechaEn, T1.Lb_FechaR, T1.Lb_FecNoa1, T1.Lb_hhnoa1 FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE (T1.EmprCod = ? and T1.Lb_numero = ?) AND (T1.Lb_Estado = 1) ORDER BY T1.EmprCod, T1.Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = GXutil.resetDate(rslt.getGXDateTime(14));
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

