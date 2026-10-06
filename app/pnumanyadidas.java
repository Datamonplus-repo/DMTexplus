package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumanyadidas extends GXProcedure
{
   public pnumanyadidas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumanyadidas.class ), "" );
   }

   public pnumanyadidas( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      pnumanyadidas.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pnumanyadidas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumanyadidas.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pnumanyadidas.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnumanyadidas.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnumanyadidas.this.AV8BarNumany = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P059S2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A189BarNumAny = P059S2_A189BarNumAny[0] ;
         A120BarAgrEst = P059S2_A120BarAgrEst[0] ;
         A189BarNumAny = AV8BarNumany ;
         if ( GXutil.strcmp(A120BarAgrEst, "S") == 0 )
         {
            /* Using cursor P059S3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A119BarAgrCod = P059S3_A119BarAgrCod[0] ;
               A124BarAgrReo = P059S3_A124BarAgrReo[0] ;
               A122BarAgrPar = P059S3_A122BarAgrPar[0] ;
               GXv_char1[0] = A396EmprCod ;
               GXv_int2[0] = A119BarAgrCod ;
               GXv_int3[0] = A124BarAgrReo ;
               GXv_char4[0] = A122BarAgrPar ;
               GXv_int5[0] = AV8BarNumany ;
               new app.pnumaagrupadas(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5) ;
               pnumanyadidas.this.A396EmprCod = GXv_char1[0] ;
               pnumanyadidas.this.A119BarAgrCod = GXv_int2[0] ;
               pnumanyadidas.this.A124BarAgrReo = GXv_int3[0] ;
               pnumanyadidas.this.A122BarAgrPar = GXv_char4[0] ;
               pnumanyadidas.this.AV8BarNumany = GXv_int5[0] ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         /* Using cursor P059S4 */
         pr_default.execute(2, new Object[] {Short.valueOf(A189BarNumAny), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumanyadidas.this.A396EmprCod;
      this.aP1[0] = pnumanyadidas.this.A129BarCod;
      this.aP2[0] = pnumanyadidas.this.A132BarCodReo;
      this.aP3[0] = pnumanyadidas.this.A130BarCodPar;
      this.aP4[0] = pnumanyadidas.this.AV8BarNumany;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumanyadidas");
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
      P059S2_A396EmprCod = new String[] {""} ;
      P059S2_A129BarCod = new int[1] ;
      P059S2_A132BarCodReo = new byte[1] ;
      P059S2_A130BarCodPar = new String[] {""} ;
      P059S2_A189BarNumAny = new short[1] ;
      P059S2_A120BarAgrEst = new String[] {""} ;
      A120BarAgrEst = "" ;
      P059S3_A396EmprCod = new String[] {""} ;
      P059S3_A129BarCod = new int[1] ;
      P059S3_A132BarCodReo = new byte[1] ;
      P059S3_A130BarCodPar = new String[] {""} ;
      P059S3_A119BarAgrCod = new int[1] ;
      P059S3_A124BarAgrReo = new byte[1] ;
      P059S3_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumanyadidas__default(),
         new Object[] {
             new Object[] {
            P059S2_A396EmprCod, P059S2_A129BarCod, P059S2_A132BarCodReo, P059S2_A130BarCodPar, P059S2_A189BarNumAny, P059S2_A120BarAgrEst
            }
            , new Object[] {
            P059S3_A396EmprCod, P059S3_A129BarCod, P059S3_A132BarCodReo, P059S3_A130BarCodPar, P059S3_A119BarAgrCod, P059S3_A124BarAgrReo, P059S3_A122BarAgrPar
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int3[] ;
   private short AV8BarNumany ;
   private short A189BarNumAny ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String A122BarAgrPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P059S2_A396EmprCod ;
   private int[] P059S2_A129BarCod ;
   private byte[] P059S2_A132BarCodReo ;
   private String[] P059S2_A130BarCodPar ;
   private short[] P059S2_A189BarNumAny ;
   private String[] P059S2_A120BarAgrEst ;
   private String[] P059S3_A396EmprCod ;
   private int[] P059S3_A129BarCod ;
   private byte[] P059S3_A132BarCodReo ;
   private String[] P059S3_A130BarCodPar ;
   private int[] P059S3_A119BarAgrCod ;
   private byte[] P059S3_A124BarAgrReo ;
   private String[] P059S3_A122BarAgrPar ;
}

final  class pnumanyadidas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P059S2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNumAny, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P059S3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P059S4", "UPDATE TXPBARCAD SET BarNumAny=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

