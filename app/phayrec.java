package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phayrec extends GXProcedure
{
   public phayrec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phayrec.class ), "" );
   }

   public phayrec( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           byte aP2 ,
                           String aP3 )
   {
      phayrec.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             byte[] aP4 )
   {
      phayrec.this.A396EmprCod = aP0;
      phayrec.this.AV9BarCod = aP1;
      phayrec.this.AV10BarCodReo = aP2;
      phayrec.this.AV11BarCodPar = aP3;
      phayrec.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FlagRec = (byte)(0) ;
      /* Using cursor P00VI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00VI2_A130BarCodPar[0] ;
         A132BarCodReo = P00VI2_A132BarCodReo[0] ;
         A129BarCod = P00VI2_A129BarCod[0] ;
         A120BarAgrEst = P00VI2_A120BarAgrEst[0] ;
         AV12Barcodm = A129BarCod ;
         AV13Barcodreom = A132BarCodReo ;
         AV14Barcodparm = A130BarCodPar ;
         if ( GXutil.strcmp(A120BarAgrEst, "S") == 0 )
         {
            GXv_int1[0] = AV12Barcodm ;
            GXv_int2[0] = AV13Barcodreom ;
            GXv_char3[0] = AV14Barcodparm ;
            new app.pedidosclientesindetalle.hdrminima(remoteHandle, context).execute( A396EmprCod, GXv_int1, GXv_int2, GXv_char3) ;
            phayrec.this.AV12Barcodm = GXv_int1[0] ;
            phayrec.this.AV13Barcodreom = GXv_int2[0] ;
            phayrec.this.AV14Barcodparm = GXv_char3[0] ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00VI3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV12Barcodm), Byte.valueOf(AV13Barcodreom), AV14Barcodparm});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P00VI3_A130BarCodPar[0] ;
         A132BarCodReo = P00VI3_A132BarCodReo[0] ;
         A129BarCod = P00VI3_A129BarCod[0] ;
         A2805RecVolPrd = P00VI3_A2805RecVolPrd[0] ;
         A6039RecAcab = P00VI3_A6039RecAcab[0] ;
         n6039RecAcab = P00VI3_n6039RecAcab[0] ;
         A2804RecLinMaq = P00VI3_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, "S") != 0 )
         {
            AV8FlagRec = (byte)(1) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = phayrec.this.AV8FlagRec;
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
      P00VI2_A396EmprCod = new String[] {""} ;
      P00VI2_A130BarCodPar = new String[] {""} ;
      P00VI2_A132BarCodReo = new byte[1] ;
      P00VI2_A129BarCod = new int[1] ;
      P00VI2_A120BarAgrEst = new String[] {""} ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      AV14Barcodparm = "" ;
      GXv_int1 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char3 = new String[1] ;
      P00VI3_A396EmprCod = new String[] {""} ;
      P00VI3_A130BarCodPar = new String[] {""} ;
      P00VI3_A132BarCodReo = new byte[1] ;
      P00VI3_A129BarCod = new int[1] ;
      P00VI3_A2805RecVolPrd = new int[1] ;
      P00VI3_A6039RecAcab = new String[] {""} ;
      P00VI3_n6039RecAcab = new boolean[] {false} ;
      P00VI3_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phayrec__default(),
         new Object[] {
             new Object[] {
            P00VI2_A396EmprCod, P00VI2_A130BarCodPar, P00VI2_A132BarCodReo, P00VI2_A129BarCod, P00VI2_A120BarAgrEst
            }
            , new Object[] {
            P00VI3_A396EmprCod, P00VI3_A130BarCodPar, P00VI3_A132BarCodReo, P00VI3_A129BarCod, P00VI3_A2805RecVolPrd, P00VI3_A6039RecAcab, P00VI3_n6039RecAcab, P00VI3_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10BarCodReo ;
   private byte AV8FlagRec ;
   private byte A132BarCodReo ;
   private byte AV13Barcodreom ;
   private byte GXv_int2[] ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int A129BarCod ;
   private int AV12Barcodm ;
   private int GXv_int1[] ;
   private int A2805RecVolPrd ;
   private String A396EmprCod ;
   private String AV11BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String AV14Barcodparm ;
   private String GXv_char3[] ;
   private String A6039RecAcab ;
   private boolean n6039RecAcab ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00VI2_A396EmprCod ;
   private String[] P00VI2_A130BarCodPar ;
   private byte[] P00VI2_A132BarCodReo ;
   private int[] P00VI2_A129BarCod ;
   private String[] P00VI2_A120BarAgrEst ;
   private String[] P00VI3_A396EmprCod ;
   private String[] P00VI3_A130BarCodPar ;
   private byte[] P00VI3_A132BarCodReo ;
   private int[] P00VI3_A129BarCod ;
   private int[] P00VI3_A2805RecVolPrd ;
   private String[] P00VI3_A6039RecAcab ;
   private boolean[] P00VI3_n6039RecAcab ;
   private short[] P00VI3_A2804RecLinMaq ;
}

final  class phayrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00VI2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00VI3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, RecVolPrd, RecAcab, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
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
      }
   }

}

