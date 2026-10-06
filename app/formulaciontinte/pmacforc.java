package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmacforc extends GXProcedure
{
   public pmacforc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmacforc.class ), "" );
   }

   public pmacforc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pmacforc.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pmacforc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmacforc.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pmacforc.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pmacforc.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pmacforc.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pmacforc.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pmacforc.this.AV8MacProCod = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Delete Procesos....", "") );
      /* Optimized DELETE. */
      /* Using cursor P031V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
      /* End optimized DELETE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.pmacforc");
      System.out.println( httpContext.getMessage( "Creo Procesos....", "") );
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV8MacProCod ;
      GXv_int3[0] = A252CliCod ;
      GXv_char4[0] = A494ForSer ;
      GXv_char5[0] = A482ForColNom ;
      GXv_int6[0] = A483ForColNum ;
      GXv_int7[0] = A831TipColCod ;
      GXv_int8[0] = AV10ForUltLin ;
      new app.formulaciontinte.paltpro(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int7, GXv_int8) ;
      pmacforc.this.A396EmprCod = GXv_char1[0] ;
      pmacforc.this.AV8MacProCod = GXv_char2[0] ;
      pmacforc.this.A252CliCod = GXv_int3[0] ;
      pmacforc.this.A494ForSer = GXv_char4[0] ;
      pmacforc.this.A482ForColNom = GXv_char5[0] ;
      pmacforc.this.A483ForColNum = GXv_int6[0] ;
      pmacforc.this.A831TipColCod = GXv_int7[0] ;
      pmacforc.this.AV10ForUltLin = GXv_int8[0] ;
      System.out.println( httpContext.getMessage( "Actualizo Formula....", "") );
      n1514MacProCod = false ;
      n1159ForUltLin = false ;
      /* Optimized UPDATE. */
      /* Using cursor P031V3 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n1514MacProCod), AV8MacProCod, Boolean.valueOf(n1159ForUltLin), Short.valueOf(AV10ForUltLin), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmacforc.this.A396EmprCod;
      this.aP1[0] = pmacforc.this.A252CliCod;
      this.aP2[0] = pmacforc.this.A494ForSer;
      this.aP3[0] = pmacforc.this.A482ForColNom;
      this.aP4[0] = pmacforc.this.A483ForColNum;
      this.aP5[0] = pmacforc.this.A831TipColCod;
      this.aP6[0] = pmacforc.this.AV8MacProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.pmacforc");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int8 = new short[1] ;
      A1514MacProCod = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.pmacforc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.pmacforc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.pmacforc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.pmacforc__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte GXv_int7[] ;
   private short AV10ForUltLin ;
   private short GXv_int8[] ;
   private short A1159ForUltLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int GXv_int3[] ;
   private int GXv_int6[] ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV8MacProCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String A1514MacProCod ;
   private boolean n1514MacProCod ;
   private boolean n1159ForUltLin ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pmacforc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pmacforc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pmacforc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pmacforc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P031V2", "DELETE FROM TXPLFORMU  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new UpdateCursor("P031V3", "UPDATE TXPCFORMU SET MacProCod=?, ForUltLin=?  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 16);
               stmt.setString(6, (String)parms[7], 13);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               return;
      }
   }

}

