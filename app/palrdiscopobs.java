package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palrdiscopobs extends GXProcedure
{
   public palrdiscopobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palrdiscopobs.class ), "" );
   }

   public palrdiscopobs( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      palrdiscopobs.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      palrdiscopobs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palrdiscopobs.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      palrdiscopobs.this.A44AlbRecCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01612 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1300AlbRObs = P01612_A1300AlbRObs[0] ;
         A252CliCod = P01612_A252CliCod[0] ;
         A1299AlbRLin = P01612_A1299AlbRLin[0] ;
         A252CliCod = P01612_A252CliCod[0] ;
         /* Using cursor P01613 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A252CliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A378DisObsULin = P01613_A378DisObsULin[0] ;
            A378DisObsULin = (byte)(A378DisObsULin+1) ;
            /*
               INSERT RECORD ON TABLE TXPOBSERV

            */
            A376DisObsLin = A378DisObsULin ;
            A377DisObsTxt = A1300AlbRObs ;
            /* Using cursor P01614 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
            if ( (pr_default.getStatus(2) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            /* Using cursor P01615 */
            pr_default.execute(3, new Object[] {Byte.valueOf(A378DisObsULin), A396EmprCod, Integer.valueOf(A361DisCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palrdiscopobs.this.A396EmprCod;
      this.aP1[0] = palrdiscopobs.this.A361DisCod;
      this.aP2[0] = palrdiscopobs.this.A44AlbRecCod;
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
      P01612_A396EmprCod = new String[] {""} ;
      P01612_A44AlbRecCod = new int[1] ;
      P01612_A1300AlbRObs = new String[] {""} ;
      P01612_A252CliCod = new int[1] ;
      P01612_A1299AlbRLin = new byte[1] ;
      A1300AlbRObs = "" ;
      P01613_A396EmprCod = new String[] {""} ;
      P01613_A361DisCod = new int[1] ;
      P01613_A252CliCod = new int[1] ;
      P01613_A378DisObsULin = new byte[1] ;
      A377DisObsTxt = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palrdiscopobs__default(),
         new Object[] {
             new Object[] {
            P01612_A396EmprCod, P01612_A44AlbRecCod, P01612_A1300AlbRObs, P01612_A252CliCod, P01612_A1299AlbRLin
            }
            , new Object[] {
            P01613_A396EmprCod, P01613_A361DisCod, P01613_A252CliCod, P01613_A378DisObsULin
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

   private byte A1299AlbRLin ;
   private byte A378DisObsULin ;
   private byte A376DisObsLin ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int GX_INS40 ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A1300AlbRObs ;
   private String A377DisObsTxt ;
   private String Gx_emsg ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01612_A396EmprCod ;
   private int[] P01612_A44AlbRecCod ;
   private String[] P01612_A1300AlbRObs ;
   private int[] P01612_A252CliCod ;
   private byte[] P01612_A1299AlbRLin ;
   private String[] P01613_A396EmprCod ;
   private int[] P01613_A361DisCod ;
   private int[] P01613_A252CliCod ;
   private byte[] P01613_A378DisObsULin ;
}

final  class palrdiscopobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01612", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRObs, T2.CliCod, T1.AlbRLin FROM (TXPALBROB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01613", "SELECT EmprCod, DisCod, CliCod, DisObsULin FROM TXPDISPOS WHERE (EmprCod = ? and DisCod = ?) AND (CliCod = ?) ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01614", "INSERT INTO TXPOBSERV(EmprCod, DisCod, DisObsLin, DisObsTxt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new UpdateCursor("P01615", "UPDATE TXPDISPOS SET DisObsULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

