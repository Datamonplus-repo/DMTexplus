package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccostcambio extends GXProcedure
{
   public pccostcambio( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccostcambio.class ), "" );
   }

   public pccostcambio( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 )
   {
      pccostcambio.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      pccostcambio.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccostcambio.this.AV8CCStkPed = aP1[0];
      this.aP1 = aP1;
      pccostcambio.this.AV9CCoCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.popup(formatLink("app.messageprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "Cambio Costes...", "")))}, new String[] {"Texto"}) , new Object[] {""});
      /* Using cursor P04OH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CCStkPed)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3353CCStkPed = P04OH2_A3353CCStkPed[0] ;
         A3357CCStkDsc = P04OH2_A3357CCStkDsc[0] ;
         A3345TipMovCc = P04OH2_A3345TipMovCc[0] ;
         A3839CcoCod = P04OH2_A3839CcoCod[0] ;
         A719PrdNum = P04OH2_A719PrdNum[0] ;
         A3342CCStkLin = P04OH2_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", "")) == 0 )
         {
            if ( ( GXutil.strcmp(A3357CCStkDsc, httpContext.getMessage( "Consumo Manual", "")) == 0 ) || ( GXutil.strcmp(A3357CCStkDsc, httpContext.getMessage( "Consumo Manual CC,TCONMAC", "")) == 0 ) || ( GXutil.strcmp(A3357CCStkDsc, httpContext.getMessage( "Consumo Manual Almacen,TCONMAC", "")) == 0 ) )
            {
               A3839CcoCod = AV9CCoCod ;
               /* Using cursor P04OH3 */
               pr_default.execute(1, new Object[] {Short.valueOf(A3839CcoCod), A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccostcambio.this.A396EmprCod;
      this.aP1[0] = pccostcambio.this.AV8CCStkPed;
      this.aP2[0] = pccostcambio.this.AV9CCoCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pccostcambio");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P04OH2_A396EmprCod = new String[] {""} ;
      P04OH2_A3353CCStkPed = new int[1] ;
      P04OH2_A3357CCStkDsc = new String[] {""} ;
      P04OH2_A3345TipMovCc = new String[] {""} ;
      P04OH2_A3839CcoCod = new short[1] ;
      P04OH2_A719PrdNum = new String[] {""} ;
      P04OH2_A3342CCStkLin = new long[1] ;
      A3357CCStkDsc = "" ;
      A3345TipMovCc = "" ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pccostcambio__default(),
         new Object[] {
             new Object[] {
            P04OH2_A396EmprCod, P04OH2_A3353CCStkPed, P04OH2_A3357CCStkDsc, P04OH2_A3345TipMovCc, P04OH2_A3839CcoCod, P04OH2_A719PrdNum, P04OH2_A3342CCStkLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9CCoCod ;
   private short A3839CcoCod ;
   private short Gx_err ;
   private int AV8CCStkPed ;
   private int A3353CCStkPed ;
   private long A3342CCStkLin ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A3357CCStkDsc ;
   private String A3345TipMovCc ;
   private String A719PrdNum ;
   private short[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04OH2_A396EmprCod ;
   private int[] P04OH2_A3353CCStkPed ;
   private String[] P04OH2_A3357CCStkDsc ;
   private String[] P04OH2_A3345TipMovCc ;
   private short[] P04OH2_A3839CcoCod ;
   private String[] P04OH2_A719PrdNum ;
   private long[] P04OH2_A3342CCStkLin ;
}

final  class pccostcambio__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04OH2", "SELECT EmprCod, CCStkPed, CCStkDsc, TipMovCc, CcoCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and CCStkPed = ? ORDER BY EmprCod, CCStkPed ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04OH3", "UPDATE TXPCCSTKS SET CcoCod=?  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
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
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
      }
   }

}

