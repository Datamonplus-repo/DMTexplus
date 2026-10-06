package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class existealbaransalida extends GXProcedure
{
   public existealbaransalida( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( existealbaransalida.class ), "" );
   }

   public existealbaransalida( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 )
   {
      existealbaransalida.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String[] aP2 )
   {
      existealbaransalida.this.AV8Emprcod = aP0;
      existealbaransalida.this.AV9MacCod = aP1;
      existealbaransalida.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Existe = (short)(0) ;
      AV15mensaje = "" ;
      /* Using cursor P0A862 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV9MacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1199MacCod = P0A862_A1199MacCod[0] ;
         A396EmprCod = P0A862_A396EmprCod[0] ;
         A1203MacBarCod = P0A862_A1203MacBarCod[0] ;
         A1204MacBarReo = P0A862_A1204MacBarReo[0] ;
         A1205MacBarPar = P0A862_A1205MacBarPar[0] ;
         A1201MacLin = P0A862_A1201MacLin[0] ;
         AV11Macbarcod = A1203MacBarCod ;
         AV12Macbarreo = A1204MacBarReo ;
         AV13MacBarpar = A1205MacBarPar ;
         /* Execute user subroutine: 'ALBBAR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV10Existe == 1 )
         {
            AV15mensaje = httpContext.getMessage( "Atencion, existe Documento Salida ", "") + GXutil.trim( GXutil.str( AV14albprocod, 10, 0)) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      /* Using cursor P0A863 */
      pr_default.execute(1, new Object[] {AV8Emprcod, Integer.valueOf(AV11Macbarcod), Byte.valueOf(AV12Macbarreo), AV13MacBarpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P0A863_A130BarCodPar[0] ;
         A132BarCodReo = P0A863_A132BarCodReo[0] ;
         A129BarCod = P0A863_A129BarCod[0] ;
         A396EmprCod = P0A863_A396EmprCod[0] ;
         A30AlbProCod = P0A863_A30AlbProCod[0] ;
         AV14albprocod = A30AlbProCod ;
         AV10Existe = (short)(1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP2[0] = existealbaransalida.this.AV15mensaje;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15mensaje = "" ;
      scmdbuf = "" ;
      P0A862_A1199MacCod = new int[1] ;
      P0A862_A396EmprCod = new String[] {""} ;
      P0A862_A1203MacBarCod = new int[1] ;
      P0A862_A1204MacBarReo = new byte[1] ;
      P0A862_A1205MacBarPar = new String[] {""} ;
      P0A862_A1201MacLin = new short[1] ;
      A396EmprCod = "" ;
      A1205MacBarPar = "" ;
      AV13MacBarpar = "" ;
      P0A863_A130BarCodPar = new String[] {""} ;
      P0A863_A132BarCodReo = new byte[1] ;
      P0A863_A129BarCod = new int[1] ;
      P0A863_A396EmprCod = new String[] {""} ;
      P0A863_A30AlbProCod = new long[1] ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.existealbaransalida__default(),
         new Object[] {
             new Object[] {
            P0A862_A1199MacCod, P0A862_A396EmprCod, P0A862_A1203MacBarCod, P0A862_A1204MacBarReo, P0A862_A1205MacBarPar, P0A862_A1201MacLin
            }
            , new Object[] {
            P0A863_A130BarCodPar, P0A863_A132BarCodReo, P0A863_A129BarCod, P0A863_A396EmprCod, P0A863_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1204MacBarReo ;
   private byte AV12Macbarreo ;
   private byte A132BarCodReo ;
   private short AV10Existe ;
   private short A1201MacLin ;
   private short Gx_err ;
   private int AV9MacCod ;
   private int A1199MacCod ;
   private int A1203MacBarCod ;
   private int AV11Macbarcod ;
   private int A129BarCod ;
   private long AV14albprocod ;
   private long A30AlbProCod ;
   private String AV8Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A1205MacBarPar ;
   private String AV13MacBarpar ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private String AV15mensaje ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P0A862_A1199MacCod ;
   private String[] P0A862_A396EmprCod ;
   private int[] P0A862_A1203MacBarCod ;
   private byte[] P0A862_A1204MacBarReo ;
   private String[] P0A862_A1205MacBarPar ;
   private short[] P0A862_A1201MacLin ;
   private String[] P0A863_A130BarCodPar ;
   private byte[] P0A863_A132BarCodReo ;
   private int[] P0A863_A129BarCod ;
   private String[] P0A863_A396EmprCod ;
   private long[] P0A863_A30AlbProCod ;
}

final  class existealbaransalida__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A862", "SELECT MacCod, EmprCod, MacBarCod, MacBarReo, MacBarPar, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A863", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((long[]) buf[4])[0] = rslt.getLong(5);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

