package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactemp extends GXProcedure
{
   public pactemp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactemp.class ), "" );
   }

   public pactemp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             int[] aP10 )
   {
      pactemp.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        int[] aP7 ,
                        String[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 )
   {
      pactemp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactemp.this.AV27AlbReccod = aP1[0];
      this.aP1 = aP1;
      pactemp.this.AV18Kilos = aP2[0];
      this.aP2 = aP2;
      pactemp.this.AV20Metros = aP3[0];
      this.aP3 = aP3;
      pactemp.this.AV19Piezas = aP4[0];
      this.aP4 = aP4;
      pactemp.this.AV21Kilosold = aP5[0];
      this.aP5 = aP5;
      pactemp.this.AV22Metrosold = aP6[0];
      this.aP6 = aP6;
      pactemp.this.AV23Piezasold = aP7[0];
      this.aP7 = aP7;
      pactemp.this.AV24DisUnimed = aP8[0];
      this.aP8 = aP8;
      pactemp.this.AV25AlbRunidis = aP9[0];
      this.aP9 = aP9;
      pactemp.this.AV26Albrpiedis = aP10[0];
      this.aP10 = aP10;
      pactemp.this.AV31Op = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02ES2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV27AlbReccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P02ES2_A44AlbRecCod[0] ;
         A60AlbRUniUti = P02ES2_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P02ES2_A54AlbRPieUti[0] ;
         A47AlbREst = P02ES2_A47AlbREst[0] ;
         A58AlbRUniEnt = P02ES2_A58AlbRUniEnt[0] ;
         if ( GXutil.strcmp(AV31Op, httpContext.getMessage( "A", "")) == 0 )
         {
            if ( GXutil.strcmp(AV24DisUnimed, httpContext.getMessage( "K", "")) == 0 )
            {
               A60AlbRUniUti = A60AlbRUniUti.add(((AV18Kilos.subtract(AV21Kilosold)))) ;
            }
            else
            {
               A60AlbRUniUti = A60AlbRUniUti.add(((AV20Metros.subtract(AV22Metrosold)))) ;
            }
            A54AlbRPieUti = (int)(A54AlbRPieUti+((AV19Piezas-AV23Piezasold))) ;
            A47AlbREst = (byte)(0) ;
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() <= 0 )
            {
               A47AlbREst = (byte)(1) ;
            }
         }
         if ( GXutil.strcmp(AV31Op, httpContext.getMessage( "B", "")) == 0 )
         {
            if ( GXutil.strcmp(AV24DisUnimed, httpContext.getMessage( "K", "")) == 0 )
            {
               A60AlbRUniUti = A60AlbRUniUti.subtract(AV18Kilos) ;
            }
            else
            {
               A60AlbRUniUti = A60AlbRUniUti.subtract(AV20Metros) ;
            }
            A54AlbRPieUti = (int)(A54AlbRPieUti-AV19Piezas) ;
            A47AlbREst = (byte)(0) ;
         }
         /* Using cursor P02ES3 */
         pr_default.execute(1, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      Application.commitDataStores(context, remoteHandle, pr_default, "pactemp");
      /* Using cursor P02ES4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV27AlbReccod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A44AlbRecCod = P02ES4_A44AlbRecCod[0] ;
         A54AlbRPieUti = P02ES4_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P02ES4_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P02ES4_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P02ES4_A58AlbRUniEnt[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV25AlbRunidis = A57AlbRUniDis ;
         AV26Albrpiedis = A51AlbRPieDis ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactemp.this.A396EmprCod;
      this.aP1[0] = pactemp.this.AV27AlbReccod;
      this.aP2[0] = pactemp.this.AV18Kilos;
      this.aP3[0] = pactemp.this.AV20Metros;
      this.aP4[0] = pactemp.this.AV19Piezas;
      this.aP5[0] = pactemp.this.AV21Kilosold;
      this.aP6[0] = pactemp.this.AV22Metrosold;
      this.aP7[0] = pactemp.this.AV23Piezasold;
      this.aP8[0] = pactemp.this.AV24DisUnimed;
      this.aP9[0] = pactemp.this.AV25AlbRunidis;
      this.aP10[0] = pactemp.this.AV26Albrpiedis;
      this.aP11[0] = pactemp.this.AV31Op;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactemp");
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
      P02ES2_A396EmprCod = new String[] {""} ;
      P02ES2_A44AlbRecCod = new int[1] ;
      P02ES2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02ES2_A54AlbRPieUti = new int[1] ;
      P02ES2_A47AlbREst = new byte[1] ;
      P02ES2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      P02ES4_A396EmprCod = new String[] {""} ;
      P02ES4_A44AlbRecCod = new int[1] ;
      P02ES4_A54AlbRPieUti = new int[1] ;
      P02ES4_A52AlbRPieEnt = new int[1] ;
      P02ES4_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02ES4_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pactemp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pactemp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pactemp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactemp__default(),
         new Object[] {
             new Object[] {
            P02ES2_A396EmprCod, P02ES2_A44AlbRecCod, P02ES2_A60AlbRUniUti, P02ES2_A54AlbRPieUti, P02ES2_A47AlbREst, P02ES2_A58AlbRUniEnt
            }
            , new Object[] {
            }
            , new Object[] {
            P02ES4_A396EmprCod, P02ES4_A44AlbRecCod, P02ES4_A54AlbRPieUti, P02ES4_A52AlbRPieEnt, P02ES4_A60AlbRUniUti, P02ES4_A58AlbRUniEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private short Gx_err ;
   private int AV27AlbReccod ;
   private int AV19Piezas ;
   private int AV23Piezasold ;
   private int AV26Albrpiedis ;
   private int A44AlbRecCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private java.math.BigDecimal AV18Kilos ;
   private java.math.BigDecimal AV20Metros ;
   private java.math.BigDecimal AV21Kilosold ;
   private java.math.BigDecimal AV22Metrosold ;
   private java.math.BigDecimal AV25AlbRunidis ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private String A396EmprCod ;
   private String AV24DisUnimed ;
   private String AV31Op ;
   private String scmdbuf ;
   private String[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private int[] aP7 ;
   private String[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private int[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P02ES2_A396EmprCod ;
   private int[] P02ES2_A44AlbRecCod ;
   private java.math.BigDecimal[] P02ES2_A60AlbRUniUti ;
   private int[] P02ES2_A54AlbRPieUti ;
   private byte[] P02ES2_A47AlbREst ;
   private java.math.BigDecimal[] P02ES2_A58AlbRUniEnt ;
   private String[] P02ES4_A396EmprCod ;
   private int[] P02ES4_A44AlbRecCod ;
   private int[] P02ES4_A54AlbRPieUti ;
   private int[] P02ES4_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P02ES4_A60AlbRUniUti ;
   private java.math.BigDecimal[] P02ES4_A58AlbRUniEnt ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pactemp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pactemp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pactemp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pactemp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02ES2", "SELECT EmprCod, AlbRecCod, AlbRUniUti, AlbRPieUti, AlbREst, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02ES3", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P02ES4", "SELECT EmprCod, AlbRecCod, AlbRPieUti, AlbRPieEnt, AlbRUniUti, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

