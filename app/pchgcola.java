package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pchgcola extends GXProcedure
{
   public pchgcola( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pchgcola.class ), "" );
   }

   public pchgcola( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          int[] aP5 ,
                          String[] aP6 )
   {
      pchgcola.this.aP7 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 )
   {
      pchgcola.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pchgcola.this.A119BarAgrCod = aP1[0];
      this.aP1 = aP1;
      pchgcola.this.A124BarAgrReo = aP2[0];
      this.aP2 = aP2;
      pchgcola.this.A122BarAgrPar = aP3[0];
      this.aP3 = aP3;
      pchgcola.this.AV8Forcolnom = aP4[0];
      this.aP4 = aP4;
      pchgcola.this.AV9Forcolnum = aP5[0];
      this.aP5 = aP5;
      pchgcola.this.AV10BarNomcli = aP6[0];
      this.aP6 = aP6;
      pchgcola.this.AV11BarNumcli = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P02KK2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV11BarNumcli), AV10BarNomcli, Integer.valueOf(AV9Forcolnum), AV8Forcolnom, A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pchgcola.this.A396EmprCod;
      this.aP1[0] = pchgcola.this.A119BarAgrCod;
      this.aP2[0] = pchgcola.this.A124BarAgrReo;
      this.aP3[0] = pchgcola.this.A122BarAgrPar;
      this.aP4[0] = pchgcola.this.AV8Forcolnom;
      this.aP5[0] = pchgcola.this.AV9Forcolnum;
      this.aP6[0] = pchgcola.this.AV10BarNomcli;
      this.aP7[0] = pchgcola.this.AV11BarNumcli;
      Application.commitDataStores(context, remoteHandle, pr_default, "pchgcola");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A1509ColNoCAgr = "" ;
      A1510ColNomAgr = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pchgcola__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A124BarAgrReo ;
   private short Gx_err ;
   private int A119BarAgrCod ;
   private int AV9Forcolnum ;
   private int AV11BarNumcli ;
   private int A1511ColNuCAgr ;
   private int A1512ColNumAgr ;
   private String A396EmprCod ;
   private String A122BarAgrPar ;
   private String AV8Forcolnom ;
   private String AV10BarNomcli ;
   private String A1509ColNoCAgr ;
   private String A1510ColNomAgr ;
   private int[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
}

final  class pchgcola__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02KK2", "UPDATE TXPBARAGR SET ColNuCAgr=?, ColNoCAgr=?, ColNumAgr=?, ColNomAgr=?  WHERE EmprCod = ? and BarAgrCod = ? and BarAgrReo = ? and BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 13);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
      }
   }

}

