package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumrol extends GXProcedure
{
   public pnumrol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumrol.class ), "" );
   }

   public pnumrol( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 )
   {
      pnumrol.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      pnumrol.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumrol.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pnumrol.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnumrol.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnumrol.this.AV8BarNumLot = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV9Tintutex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int2) ;
      pnumrol.this.GXt_int1 = GXv_int2[0] ;
      AV9Tintutex = GXt_int1 ;
      /* Using cursor P02LU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2826BarNumLot = P02LU2_A2826BarNumLot[0] ;
         A4464BarAcaFor = P02LU2_A4464BarAcaFor[0] ;
         n4464BarAcaFor = P02LU2_n4464BarAcaFor[0] ;
         if ( AV9Tintutex == 0 )
         {
            AV8BarNumLot = (int)(A2826BarNumLot+1) ;
            A2826BarNumLot = AV8BarNumLot ;
         }
         else
         {
            AV8BarNumLot = (int)(A4464BarAcaFor+1) ;
            A4464BarAcaFor = AV8BarNumLot ;
            n4464BarAcaFor = false ;
         }
         /* Using cursor P02LU3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A2826BarNumLot), Boolean.valueOf(n4464BarAcaFor), Integer.valueOf(A4464BarAcaFor), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumrol.this.A396EmprCod;
      this.aP1[0] = pnumrol.this.A129BarCod;
      this.aP2[0] = pnumrol.this.A132BarCodReo;
      this.aP3[0] = pnumrol.this.A130BarCodPar;
      this.aP4[0] = pnumrol.this.AV8BarNumLot;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumrol");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P02LU2_A396EmprCod = new String[] {""} ;
      P02LU2_A129BarCod = new int[1] ;
      P02LU2_A132BarCodReo = new byte[1] ;
      P02LU2_A130BarCodPar = new String[] {""} ;
      P02LU2_A2826BarNumLot = new int[1] ;
      P02LU2_A4464BarAcaFor = new int[1] ;
      P02LU2_n4464BarAcaFor = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumrol__default(),
         new Object[] {
             new Object[] {
            P02LU2_A396EmprCod, P02LU2_A129BarCod, P02LU2_A132BarCodReo, P02LU2_A130BarCodPar, P02LU2_A2826BarNumLot, P02LU2_A4464BarAcaFor, P02LU2_n4464BarAcaFor
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV9Tintutex ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8BarNumLot ;
   private int A2826BarNumLot ;
   private int A4464BarAcaFor ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private boolean n4464BarAcaFor ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02LU2_A396EmprCod ;
   private int[] P02LU2_A129BarCod ;
   private byte[] P02LU2_A132BarCodReo ;
   private String[] P02LU2_A130BarCodPar ;
   private int[] P02LU2_A2826BarNumLot ;
   private int[] P02LU2_A4464BarAcaFor ;
   private boolean[] P02LU2_n4464BarAcaFor ;
}

final  class pnumrol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02LU2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNumLot, BarAcaFor FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02LU3", "UPDATE TXPBARCAD SET BarNumLot=?, BarAcaFor=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               return;
      }
   }

}

