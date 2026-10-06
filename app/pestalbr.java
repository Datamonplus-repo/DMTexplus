package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestalbr extends GXProcedure
{
   public pestalbr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestalbr.class ), "" );
   }

   public pestalbr( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pestalbr.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pestalbr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pestalbr.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pestalbr.this.AV9Usurcod = aP2[0];
      this.aP2 = aP2;
      pestalbr.this.AV10station = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05L82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A47AlbREst = P05L82_A47AlbREst[0] ;
         A60AlbRUniUti = P05L82_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P05L82_A58AlbRUniEnt[0] ;
         AV8AlbREst = A47AlbREst ;
         A47AlbREst = (byte)(((A58AlbRUniEnt.subtract(A60AlbRUniUti).doubleValue()<=0) ? 1 : 0)) ;
         AV11Inc_obs = httpContext.getMessage( "Control Estado, Entrada Almacen", "") + GXutil.newLine( ) ;
         AV11Inc_obs += httpContext.getMessage( "N Recepcion ", "") + GXutil.str( A44AlbRecCod, 8, 0) + GXutil.newLine( ) ;
         AV11Inc_obs += httpContext.getMessage( "Estado      ", "") + GXutil.str( AV8AlbREst, 1, 0) + httpContext.getMessage( " cambia a ", "") + GXutil.str( A47AlbREst, 1, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV15Pgmname, AV9Usurcod, AV10station, AV11Inc_obs, A44AlbRecCod, (byte)(0), "") ;
         /* Using cursor P05L83 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pestalbr.this.A396EmprCod;
      this.aP1[0] = pestalbr.this.A44AlbRecCod;
      this.aP2[0] = pestalbr.this.AV9Usurcod;
      this.aP3[0] = pestalbr.this.AV10station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pestalbr");
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
      P05L82_A396EmprCod = new String[] {""} ;
      P05L82_A44AlbRecCod = new int[1] ;
      P05L82_A47AlbREst = new byte[1] ;
      P05L82_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05L82_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      AV11Inc_obs = "" ;
      AV15Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pestalbr__default(),
         new Object[] {
             new Object[] {
            P05L82_A396EmprCod, P05L82_A44AlbRecCod, P05L82_A47AlbREst, P05L82_A60AlbRUniUti, P05L82_A58AlbRUniEnt
            }
            , new Object[] {
            }
         }
      );
      AV15Pgmname = "PEStALBr" ;
      /* GeneXus formulas. */
      AV15Pgmname = "PEStALBr" ;
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private byte AV8AlbREst ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private String A396EmprCod ;
   private String AV9Usurcod ;
   private String AV10station ;
   private String scmdbuf ;
   private String AV15Pgmname ;
   private String AV11Inc_obs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05L82_A396EmprCod ;
   private int[] P05L82_A44AlbRecCod ;
   private byte[] P05L82_A47AlbREst ;
   private java.math.BigDecimal[] P05L82_A60AlbRUniUti ;
   private java.math.BigDecimal[] P05L82_A58AlbRUniEnt ;
}

final  class pestalbr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05L82", "SELECT EmprCod, AlbRecCod, AlbREst, AlbRUniUti, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05L83", "UPDATE TXPALBREC SET AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

