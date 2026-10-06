package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class setgetdisobsdisobs extends GXProcedure
{
   public setgetdisobsdisobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( setgetdisobsdisobs.class ), "" );
   }

   public setgetdisobsdisobs( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              int aP1 ,
                              String aP2 ,
                              byte aP3 ,
                              String aP4 )
   {
      setgetdisobsdisobs.this.aP5 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        boolean[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             boolean[] aP5 )
   {
      setgetdisobsdisobs.this.AV8EmprCod = aP0;
      setgetdisobsdisobs.this.AV9DisCod = aP1;
      setgetdisobsdisobs.this.AV10BarPri = aP2;
      setgetdisobsdisobs.this.AV11DisObsLin = aP3;
      setgetdisobsdisobs.this.AV12DisObsTxt = aP4;
      setgetdisobsdisobs.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16GXLvl14 = (byte)(0) ;
      /* Using cursor P0ADH2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9DisCod), Byte.valueOf(AV11DisObsLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A376DisObsLin = P0ADH2_A376DisObsLin[0] ;
         A361DisCod = P0ADH2_A361DisCod[0] ;
         A396EmprCod = P0ADH2_A396EmprCod[0] ;
         AV16GXLvl14 = (byte)(1) ;
         AV13isCommit = false ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV16GXLvl14 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPOBSERV

         */
         A396EmprCod = AV8EmprCod ;
         A361DisCod = AV9DisCod ;
         A376DisObsLin = AV11DisObsLin ;
         A377DisObsTxt = AV12DisObsTxt ;
         /* Using cursor P0ADH3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
         if ( (pr_default.getStatus(1) == 1) )
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
         AV13isCommit = true ;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "setgetdisobsdisobs");
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = setgetdisobsdisobs.this.AV13isCommit;
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
      P0ADH2_A376DisObsLin = new byte[1] ;
      P0ADH2_A361DisCod = new int[1] ;
      P0ADH2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      A377DisObsTxt = "" ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.setgetdisobsdisobs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.setgetdisobsdisobs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.setgetdisobsdisobs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.setgetdisobsdisobs__default(),
         new Object[] {
             new Object[] {
            P0ADH2_A376DisObsLin, P0ADH2_A361DisCod, P0ADH2_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11DisObsLin ;
   private byte AV16GXLvl14 ;
   private byte A376DisObsLin ;
   private short Gx_err ;
   private int AV9DisCod ;
   private int A361DisCod ;
   private int GX_INS40 ;
   private String AV8EmprCod ;
   private String AV10BarPri ;
   private String AV12DisObsTxt ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A377DisObsTxt ;
   private String Gx_emsg ;
   private boolean AV13isCommit ;
   private boolean[] aP5 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0ADH2_A376DisObsLin ;
   private int[] P0ADH2_A361DisCod ;
   private String[] P0ADH2_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class setgetdisobsdisobs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class setgetdisobsdisobs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class setgetdisobsdisobs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class setgetdisobsdisobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADH2", "SELECT DisObsLin, DisCod, EmprCod FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? and DisObsLin = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0ADH3", "INSERT INTO TXPOBSERV(EmprCod, DisCod, DisObsLin, DisObsTxt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               return;
      }
   }

}

