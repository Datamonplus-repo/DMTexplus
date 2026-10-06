package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paudobs extends GXProcedure
{
   public paudobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paudobs.class ), "" );
   }

   public paudobs( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      paudobs.this.aP3 = new String[] {""};
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
      paudobs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paudobs.this.A7245Aud_Hdr = aP1[0];
      this.aP1 = aP1;
      paudobs.this.A7246Aud_Hdrr = aP2[0];
      this.aP2 = aP2;
      paudobs.this.A7247Aud_Hdrp = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Aud_UltL = 0 ;
      /* Using cursor P038A2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A7245Aud_Hdr), Byte.valueOf(A7246Aud_Hdrr), A7247Aud_Hdrp});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7248Aud_UltL = P038A2_A7248Aud_UltL[0] ;
         n7248Aud_UltL = P038A2_n7248Aud_UltL[0] ;
         /* Using cursor P038A3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A7245Aud_Hdr), Byte.valueOf(A7246Aud_Hdrr), A7247Aud_Hdrp});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A7249Aud_Lin = P038A3_A7249Aud_Lin[0] ;
            AV8Aud_UltL = A7249Aud_Lin ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A7248Aud_UltL = AV8Aud_UltL ;
         n7248Aud_UltL = false ;
         /* Using cursor P038A4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n7248Aud_UltL), Integer.valueOf(A7248Aud_UltL), A396EmprCod, Integer.valueOf(A7245Aud_Hdr), Byte.valueOf(A7246Aud_Hdrr), A7247Aud_Hdrp});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAUDOPO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paudobs.this.A396EmprCod;
      this.aP1[0] = paudobs.this.A7245Aud_Hdr;
      this.aP2[0] = paudobs.this.A7246Aud_Hdrr;
      this.aP3[0] = paudobs.this.A7247Aud_Hdrp;
      Application.commitDataStores(context, remoteHandle, pr_default, "paudobs");
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
      P038A2_A396EmprCod = new String[] {""} ;
      P038A2_A7245Aud_Hdr = new int[1] ;
      P038A2_A7246Aud_Hdrr = new byte[1] ;
      P038A2_A7247Aud_Hdrp = new String[] {""} ;
      P038A2_A7248Aud_UltL = new int[1] ;
      P038A2_n7248Aud_UltL = new boolean[] {false} ;
      P038A3_A396EmprCod = new String[] {""} ;
      P038A3_A7245Aud_Hdr = new int[1] ;
      P038A3_A7246Aud_Hdrr = new byte[1] ;
      P038A3_A7247Aud_Hdrp = new String[] {""} ;
      P038A3_A7249Aud_Lin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paudobs__default(),
         new Object[] {
             new Object[] {
            P038A2_A396EmprCod, P038A2_A7245Aud_Hdr, P038A2_A7246Aud_Hdrr, P038A2_A7247Aud_Hdrp, P038A2_A7248Aud_UltL, P038A2_n7248Aud_UltL
            }
            , new Object[] {
            P038A3_A396EmprCod, P038A3_A7245Aud_Hdr, P038A3_A7246Aud_Hdrr, P038A3_A7247Aud_Hdrp, P038A3_A7249Aud_Lin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A7246Aud_Hdrr ;
   private short Gx_err ;
   private int A7245Aud_Hdr ;
   private int AV8Aud_UltL ;
   private int A7248Aud_UltL ;
   private int A7249Aud_Lin ;
   private String A396EmprCod ;
   private String A7247Aud_Hdrp ;
   private String scmdbuf ;
   private boolean n7248Aud_UltL ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P038A2_A396EmprCod ;
   private int[] P038A2_A7245Aud_Hdr ;
   private byte[] P038A2_A7246Aud_Hdrr ;
   private String[] P038A2_A7247Aud_Hdrp ;
   private int[] P038A2_A7248Aud_UltL ;
   private boolean[] P038A2_n7248Aud_UltL ;
   private String[] P038A3_A396EmprCod ;
   private int[] P038A3_A7245Aud_Hdr ;
   private byte[] P038A3_A7246Aud_Hdrr ;
   private String[] P038A3_A7247Aud_Hdrp ;
   private int[] P038A3_A7249Aud_Lin ;
}

final  class paudobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P038A2", "SELECT EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp, Aud_UltL FROM TXPAUDOPO WHERE EmprCod = ? and Aud_Hdr = ? and Aud_Hdrr = ? and Aud_Hdrp = ? ORDER BY EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P038A3", "SELECT EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp, Aud_Lin FROM TXPAUDOP1 WHERE EmprCod = ? and Aud_Hdr = ? and Aud_Hdrr = ? and Aud_Hdrp = ? ORDER BY EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp, Aud_Lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P038A4", "UPDATE TXPAUDOPO SET Aud_UltL=?  WHERE EmprCod = ? AND Aud_Hdr = ? AND Aud_Hdrr = ? AND Aud_Hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAUDOPO")
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
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
      }
   }

}

