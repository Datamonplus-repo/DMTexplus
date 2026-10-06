package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pblempe extends GXProcedure
{
   public pblempe( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pblempe.class ), "" );
   }

   public pblempe( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          String[] aP5 )
   {
      pblempe.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 )
   {
      pblempe.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pblempe.this.AV15EmpesCod = aP1[0];
      this.aP1 = aP1;
      pblempe.this.AV16CliCod = aP2[0];
      this.aP2 = aP2;
      pblempe.this.AV17FonCod = aP3[0];
      this.aP3 = aP3;
      pblempe.this.AV18EmpesLin = aP4[0];
      this.aP4 = aP4;
      pblempe.this.AV19EmpesLTip = aP5[0];
      this.aP5 = aP5;
      pblempe.this.AV20EmpesADis = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Flag = (byte)(0) ;
      if ( GXutil.strcmp(AV19EmpesLTip, httpContext.getMessage( "B", "")) == 0 )
      {
         /* Using cursor P00Y22 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV20EmpesADis), Integer.valueOf(AV16CliCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P00Y22_A361DisCod[0] ;
            A252CliCod = P00Y22_A252CliCod[0] ;
            n252CliCod = P00Y22_n252CliCod[0] ;
            AV22Flag = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P00Y23 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), Integer.valueOf(AV20EmpesADis)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A361DisCod = P00Y23_A361DisCod[0] ;
            A252CliCod = P00Y23_A252CliCod[0] ;
            n252CliCod = P00Y23_n252CliCod[0] ;
            A130BarCodPar = P00Y23_A130BarCodPar[0] ;
            A132BarCodReo = P00Y23_A132BarCodReo[0] ;
            A129BarCod = P00Y23_A129BarCod[0] ;
            AV22Flag = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      if ( AV22Flag == 0 )
      {
         /* Optimized DELETE. */
         /* Using cursor P00Y24 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV15EmpesCod, Integer.valueOf(AV16CliCod), AV17FonCod, Integer.valueOf(AV18EmpesLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEMPES");
         /* End optimized DELETE. */
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se puede eliminar la linea. Existe Disposicion/H.Ruta", ""));
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pblempe.this.A396EmprCod;
      this.aP1[0] = pblempe.this.AV15EmpesCod;
      this.aP2[0] = pblempe.this.AV16CliCod;
      this.aP3[0] = pblempe.this.AV17FonCod;
      this.aP4[0] = pblempe.this.AV18EmpesLin;
      this.aP5[0] = pblempe.this.AV19EmpesLTip;
      this.aP6[0] = pblempe.this.AV20EmpesADis;
      Application.commitDataStores(context, remoteHandle, pr_default, "pblempe");
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
      P00Y22_A396EmprCod = new String[] {""} ;
      P00Y22_A361DisCod = new int[1] ;
      P00Y22_A252CliCod = new int[1] ;
      P00Y22_n252CliCod = new boolean[] {false} ;
      P00Y23_A396EmprCod = new String[] {""} ;
      P00Y23_A361DisCod = new int[1] ;
      P00Y23_A252CliCod = new int[1] ;
      P00Y23_n252CliCod = new boolean[] {false} ;
      P00Y23_A130BarCodPar = new String[] {""} ;
      P00Y23_A132BarCodReo = new byte[1] ;
      P00Y23_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pblempe__default(),
         new Object[] {
             new Object[] {
            P00Y22_A396EmprCod, P00Y22_A361DisCod, P00Y22_A252CliCod
            }
            , new Object[] {
            P00Y23_A396EmprCod, P00Y23_A361DisCod, P00Y23_A252CliCod, P00Y23_n252CliCod, P00Y23_A130BarCodPar, P00Y23_A132BarCodReo, P00Y23_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22Flag ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV16CliCod ;
   private int AV18EmpesLin ;
   private int AV20EmpesADis ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV15EmpesCod ;
   private String AV17FonCod ;
   private String AV19EmpesLTip ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private boolean n252CliCod ;
   private int[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00Y22_A396EmprCod ;
   private int[] P00Y22_A361DisCod ;
   private int[] P00Y22_A252CliCod ;
   private boolean[] P00Y22_n252CliCod ;
   private String[] P00Y23_A396EmprCod ;
   private int[] P00Y23_A361DisCod ;
   private int[] P00Y23_A252CliCod ;
   private boolean[] P00Y23_n252CliCod ;
   private String[] P00Y23_A130BarCodPar ;
   private byte[] P00Y23_A132BarCodReo ;
   private int[] P00Y23_A129BarCod ;
}

final  class pblempe__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00Y22", "SELECT * FROM (SELECT EmprCod, DisCod, CliCod FROM TXPDISPOS WHERE (EmprCod = ? and DisCod = ?) AND (CliCod = ?) ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00Y23", "SELECT * FROM (SELECT EmprCod, DisCod, CliCod, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE (EmprCod = ?) AND (CliCod = ?) AND (DisCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00Y24", "DELETE FROM TXPLEMPES  WHERE EmprCod = ? and EmpesCod = ? and CliCod = ? and FonCod = ? and EmpesLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEMPES")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

