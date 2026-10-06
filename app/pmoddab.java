package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmoddab extends GXProcedure
{
   public pmoddab( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmoddab.class ), "" );
   }

   public pmoddab( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     String[] aP3 ,
                                     byte[] aP4 )
   {
      pmoddab.this.aP5 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        java.util.Date[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             java.util.Date[] aP5 )
   {
      pmoddab.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmoddab.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmoddab.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmoddab.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmoddab.this.AV9Sit = aP4[0];
      this.aP4 = aP4;
      pmoddab.this.AV8FecLan = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P017M2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P017M2_A213BarSit[0] ;
         A3870BarFecLRe = P017M2_A3870BarFecLRe[0] ;
         if ( A213BarSit <= 4 )
         {
            A213BarSit = AV9Sit ;
            A3870BarFecLRe = AV8FecLan ;
         }
         /* Using cursor P017M3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A213BarSit), A3870BarFecLRe, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmoddab.this.A396EmprCod;
      this.aP1[0] = pmoddab.this.A129BarCod;
      this.aP2[0] = pmoddab.this.A132BarCodReo;
      this.aP3[0] = pmoddab.this.A130BarCodPar;
      this.aP4[0] = pmoddab.this.AV9Sit;
      this.aP5[0] = pmoddab.this.AV8FecLan;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmoddab");
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
      P017M2_A396EmprCod = new String[] {""} ;
      P017M2_A129BarCod = new int[1] ;
      P017M2_A132BarCodReo = new byte[1] ;
      P017M2_A130BarCodPar = new String[] {""} ;
      P017M2_A213BarSit = new byte[1] ;
      P017M2_A3870BarFecLRe = new java.util.Date[] {GXutil.nullDate()} ;
      A3870BarFecLRe = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmoddab__default(),
         new Object[] {
             new Object[] {
            P017M2_A396EmprCod, P017M2_A129BarCod, P017M2_A132BarCodReo, P017M2_A130BarCodPar, P017M2_A213BarSit, P017M2_A3870BarFecLRe
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV9Sit ;
   private byte A213BarSit ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private java.util.Date AV8FecLan ;
   private java.util.Date A3870BarFecLRe ;
   private java.util.Date[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P017M2_A396EmprCod ;
   private int[] P017M2_A129BarCod ;
   private byte[] P017M2_A132BarCodReo ;
   private String[] P017M2_A130BarCodPar ;
   private byte[] P017M2_A213BarSit ;
   private java.util.Date[] P017M2_A3870BarFecLRe ;
}

final  class pmoddab__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P017M2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSit, BarFecLRe FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P017M3", "UPDATE TXPBARCAD SET BarSit=?, BarFecLRe=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

