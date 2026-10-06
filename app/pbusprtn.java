package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusprtn extends GXProcedure
{
   public pbusprtn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusprtn.class ), "" );
   }

   public pbusprtn( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            String[] aP2 ,
                            int[] aP3 ,
                            String[] aP4 ,
                            String[] aP5 ,
                            int[] aP6 ,
                            byte[] aP7 ,
                            String[] aP8 )
   {
      pbusprtn.this.aP9 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 )
   {
      pbusprtn.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusprtn.this.AV15MacProCod = aP1[0];
      this.aP1 = aP1;
      pbusprtn.this.AV16MacProOld = aP2[0];
      this.aP2 = aP2;
      pbusprtn.this.A252CliCod = aP3[0];
      this.aP3 = aP3;
      pbusprtn.this.A494ForSer = aP4[0];
      this.aP4 = aP4;
      pbusprtn.this.A482ForColNom = aP5[0];
      this.aP5 = aP5;
      pbusprtn.this.A483ForColNum = aP6[0];
      this.aP6 = aP6;
      pbusprtn.this.A831TipColCod = aP7[0];
      this.aP7 = aP7;
      pbusprtn.this.AV13Procesos = aP8[0];
      this.aP8 = aP8;
      pbusprtn.this.AV14ForUltLin = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ( GXutil.strcmp(AV15MacProCod, AV16MacProOld) != 0 ) && ( GXutil.strcmp(AV16MacProOld, " ") != 0 ) && ( GXutil.strcmp(AV15MacProCod, " ") != 0 ) )
      {
         Gx_msg = httpContext.getMessage( "Ha habido cambio de Nº Programa. Elimino ¡¡¡", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
         AV13Procesos = httpContext.getMessage( "N", "") ;
         /* Optimized DELETE. */
         /* Using cursor P030S2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
         /* End optimized DELETE. */
         Application.commitDataStores(context, remoteHandle, pr_default, "pbusprtn");
      }
      else
      {
         AV13Procesos = httpContext.getMessage( "N", "") ;
         /* Using cursor P030S3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1160ProForL = P030S3_A1160ProForL[0] ;
            AV13Procesos = httpContext.getMessage( "S", "") ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      if ( GXutil.strcmp(AV13Procesos, httpContext.getMessage( "N", "")) == 0 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = AV15MacProCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char4[0] = A494ForSer ;
         GXv_char5[0] = A482ForColNom ;
         GXv_int6[0] = A483ForColNum ;
         GXv_int7[0] = A831TipColCod ;
         GXv_int8[0] = AV14ForUltLin ;
         new app.formulaciontinte.paltpro(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int7, GXv_int8) ;
         pbusprtn.this.A396EmprCod = GXv_char1[0] ;
         pbusprtn.this.AV15MacProCod = GXv_char2[0] ;
         pbusprtn.this.A252CliCod = GXv_int3[0] ;
         pbusprtn.this.A494ForSer = GXv_char4[0] ;
         pbusprtn.this.A482ForColNom = GXv_char5[0] ;
         pbusprtn.this.A483ForColNum = GXv_int6[0] ;
         pbusprtn.this.A831TipColCod = GXv_int7[0] ;
         pbusprtn.this.AV14ForUltLin = GXv_int8[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusprtn.this.A396EmprCod;
      this.aP1[0] = pbusprtn.this.AV15MacProCod;
      this.aP2[0] = pbusprtn.this.AV16MacProOld;
      this.aP3[0] = pbusprtn.this.A252CliCod;
      this.aP4[0] = pbusprtn.this.A494ForSer;
      this.aP5[0] = pbusprtn.this.A482ForColNom;
      this.aP6[0] = pbusprtn.this.A483ForColNum;
      this.aP7[0] = pbusprtn.this.A831TipColCod;
      this.aP8[0] = pbusprtn.this.AV13Procesos;
      this.aP9[0] = pbusprtn.this.AV14ForUltLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbusprtn");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P030S3_A396EmprCod = new String[] {""} ;
      P030S3_A252CliCod = new int[1] ;
      P030S3_A494ForSer = new String[] {""} ;
      P030S3_A482ForColNom = new String[] {""} ;
      P030S3_A483ForColNum = new int[1] ;
      P030S3_A831TipColCod = new byte[1] ;
      P030S3_A1160ProForL = new short[1] ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int8 = new short[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pbusprtn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pbusprtn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pbusprtn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusprtn__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P030S3_A396EmprCod, P030S3_A252CliCod, P030S3_A494ForSer, P030S3_A482ForColNom, P030S3_A483ForColNum, P030S3_A831TipColCod, P030S3_A1160ProForL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte GXv_int7[] ;
   private short AV14ForUltLin ;
   private short A1160ProForL ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int GXv_int3[] ;
   private int GXv_int6[] ;
   private String A396EmprCod ;
   private String AV15MacProCod ;
   private String AV16MacProOld ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV13Procesos ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private short[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P030S3_A396EmprCod ;
   private int[] P030S3_A252CliCod ;
   private String[] P030S3_A494ForSer ;
   private String[] P030S3_A482ForColNom ;
   private int[] P030S3_A483ForColNum ;
   private byte[] P030S3_A831TipColCod ;
   private short[] P030S3_A1160ProForL ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pbusprtn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pbusprtn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pbusprtn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pbusprtn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P030S2", "DELETE FROM TXPLFORMU  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new ForEachCursor("P030S3", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

