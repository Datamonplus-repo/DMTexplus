package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgproper extends GXProcedure
{
   public pgproper( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgproper.class ), "" );
   }

   public pgproper( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pgproper.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pgproper.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgproper.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pgproper.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pgproper.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV8vFlagPer ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PERTEX", ""), GXv_int1) ;
      pgproper.this.AV8vFlagPer = GXv_int1[0] ;
      if ( AV8vFlagPer == 1 )
      {
         /* Using cursor P00JS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A758ProCod = P00JS2_A758ProCod[0] ;
            /* Using cursor P00JS3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            A2829BarProPer = P00JS3_A2829BarProPer[0] ;
            A2829BarProPer = A758ProCod ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P00JS4 */
            pr_default.execute(2, new Object[] {A2829BarProPer, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            if (true) break;
            /* Using cursor P00JS5 */
            pr_default.execute(3, new Object[] {A2829BarProPer, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            pr_default.readNext(0);
         }
         pr_default.close(0);
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgproper.this.A396EmprCod;
      this.aP1[0] = pgproper.this.A129BarCod;
      this.aP2[0] = pgproper.this.A132BarCodReo;
      this.aP3[0] = pgproper.this.A130BarCodPar;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00JS2_A396EmprCod = new String[] {""} ;
      P00JS2_A129BarCod = new int[1] ;
      P00JS2_A132BarCodReo = new byte[1] ;
      P00JS2_A130BarCodPar = new String[] {""} ;
      P00JS2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      P00JS3_A2829BarProPer = new String[] {""} ;
      A2829BarProPer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgproper__default(),
         new Object[] {
             new Object[] {
            P00JS2_A396EmprCod, P00JS2_A129BarCod, P00JS2_A132BarCodReo, P00JS2_A130BarCodPar, P00JS2_A758ProCod
            }
            , new Object[] {
            P00JS3_A2829BarProPer
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8vFlagPer ;
   private byte GXv_int1[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A2829BarProPer ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00JS2_A396EmprCod ;
   private int[] P00JS2_A129BarCod ;
   private byte[] P00JS2_A132BarCodReo ;
   private String[] P00JS2_A130BarCodPar ;
   private String[] P00JS2_A758ProCod ;
   private String[] P00JS3_A2829BarProPer ;
}

final  class pgproper__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00JS2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00JS3", "SELECT BarProPer FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00JS4", "UPDATE TXPBARCAD SET BarProPer=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P00JS5", "UPDATE TXPBARCAD SET BarProPer=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
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
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

