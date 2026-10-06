package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psitala extends GXProcedure
{
   public psitala( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psitala.class ), "" );
   }

   public psitala( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      psitala.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      psitala.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psitala.this.AV15CliCod = aP1[0];
      this.aP1 = aP1;
      psitala.this.AV16PRIO = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00B82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16PRIO});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A33AlbProEst = P00B82_A33AlbProEst[0] ;
         A39AlbProPri = P00B82_A39AlbProPri[0] ;
         A1243GuiRemCli = P00B82_A1243GuiRemCli[0] ;
         A1782AlbProEso = P00B82_A1782AlbProEso[0] ;
         A30AlbProCod = P00B82_A30AlbProCod[0] ;
         if ( A1782AlbProEso == 1 )
         {
            A1782AlbProEso = (byte)(2) ;
         }
         /* Using cursor P00B83 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psitala.this.A396EmprCod;
      this.aP1[0] = psitala.this.AV15CliCod;
      this.aP2[0] = psitala.this.AV16PRIO;
      Application.commitDataStores(context, remoteHandle, pr_default, "psitala");
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
      P00B82_A396EmprCod = new String[] {""} ;
      P00B82_A33AlbProEst = new byte[1] ;
      P00B82_A39AlbProPri = new String[] {""} ;
      P00B82_A1243GuiRemCli = new int[1] ;
      P00B82_A1782AlbProEso = new byte[1] ;
      P00B82_A30AlbProCod = new long[1] ;
      A39AlbProPri = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psitala__default(),
         new Object[] {
             new Object[] {
            P00B82_A396EmprCod, P00B82_A33AlbProEst, P00B82_A39AlbProPri, P00B82_A1243GuiRemCli, P00B82_A1782AlbProEso, P00B82_A30AlbProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private short Gx_err ;
   private int AV15CliCod ;
   private int A1243GuiRemCli ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV16PRIO ;
   private String scmdbuf ;
   private String A39AlbProPri ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00B82_A396EmprCod ;
   private byte[] P00B82_A33AlbProEst ;
   private String[] P00B82_A39AlbProPri ;
   private int[] P00B82_A1243GuiRemCli ;
   private byte[] P00B82_A1782AlbProEso ;
   private long[] P00B82_A30AlbProCod ;
}

final  class psitala__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00B82", "SELECT EmprCod, AlbProEst, AlbProPri, GuiRemCli, AlbProEso, AlbProCod FROM TXPCALPRD WHERE (EmprCod = ? and AlbProEst = 2) AND (GuiRemCli = ?) AND (AlbProPri = ?) ORDER BY EmprCod, AlbProEst ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00B83", "UPDATE TXPCALPRD SET AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

