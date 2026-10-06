package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlopcion extends GXProcedure
{
   public pctrlopcion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlopcion.class ), "" );
   }

   public pctrlopcion( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pctrlopcion.this.aP3 = new String[] {""};
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
      pctrlopcion.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlopcion.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pctrlopcion.this.AV14Usurcod = aP2[0];
      this.aP2 = aP2;
      pctrlopcion.this.AV15Station = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12LetraAct = GXutil.space( (short)(1)) ;
      AV8NumeroAct = (byte)(0) ;
      /* Using cursor P04JZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5717Lb_numopu = P04JZ2_A5717Lb_numopu[0] ;
         A5549Lb_UltOp = P04JZ2_A5549Lb_UltOp[0] ;
         /* Using cursor P04JZ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5718Lb_numop = P04JZ3_A5718Lb_numop[0] ;
            A5555Lb_opcion = P04JZ3_A5555Lb_opcion[0] ;
            AV12LetraAct = A5555Lb_opcion ;
            AV8NumeroAct = A5718Lb_numop ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( ( ( GXutil.strcmp(A5549Lb_UltOp, AV12LetraAct) != 0 ) && ( GXutil.strcmp(AV12LetraAct, " ") != 0 ) ) || ( ( A5717Lb_numopu != AV8NumeroAct ) && ( AV8NumeroAct > 0 ) ) )
         {
            AV13Inc_obs = httpContext.getMessage( "Valores Diferentes:", "") + GXutil.newLine( ) ;
            AV13Inc_obs += httpContext.getMessage( "Lb_Ultop=", "") + GXutil.trim( A5549Lb_UltOp) + GXutil.newLine( ) ;
            AV13Inc_obs += httpContext.getMessage( "LetraAct=", "") + GXutil.trim( AV12LetraAct) + GXutil.newLine( ) ;
            AV13Inc_obs += httpContext.getMessage( "Lb_numopu=", "") + GXutil.str( A5717Lb_numopu, 2, 0) + GXutil.newLine( ) ;
            AV13Inc_obs += httpContext.getMessage( "NumeroAct=", "") + GXutil.str( AV8NumeroAct, 2, 0) + GXutil.newLine( ) ;
            A5549Lb_UltOp = AV12LetraAct ;
            A5717Lb_numopu = AV8NumeroAct ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV14Usurcod, AV15Station, AV13Inc_obs, A5532Lb_numero, (byte)(0), "X") ;
         }
         /* Using cursor P04JZ4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A5717Lb_numopu), A5549Lb_UltOp, A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrlopcion.this.A396EmprCod;
      this.aP1[0] = pctrlopcion.this.A5532Lb_numero;
      this.aP2[0] = pctrlopcion.this.AV14Usurcod;
      this.aP3[0] = pctrlopcion.this.AV15Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pctrlopcion");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12LetraAct = "" ;
      scmdbuf = "" ;
      P04JZ2_A396EmprCod = new String[] {""} ;
      P04JZ2_A5532Lb_numero = new int[1] ;
      P04JZ2_A5717Lb_numopu = new byte[1] ;
      P04JZ2_A5549Lb_UltOp = new String[] {""} ;
      A5549Lb_UltOp = "" ;
      P04JZ3_A396EmprCod = new String[] {""} ;
      P04JZ3_A5532Lb_numero = new int[1] ;
      P04JZ3_A5718Lb_numop = new byte[1] ;
      P04JZ3_A5555Lb_opcion = new String[] {""} ;
      A5555Lb_opcion = "" ;
      AV13Inc_obs = "" ;
      AV20Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pctrlopcion__default(),
         new Object[] {
             new Object[] {
            P04JZ2_A396EmprCod, P04JZ2_A5532Lb_numero, P04JZ2_A5717Lb_numopu, P04JZ2_A5549Lb_UltOp
            }
            , new Object[] {
            P04JZ3_A396EmprCod, P04JZ3_A5532Lb_numero, P04JZ3_A5718Lb_numop, P04JZ3_A5555Lb_opcion
            }
            , new Object[] {
            }
         }
      );
      AV20Pgmname = "GestionLaboratorio.PCtrlOpcion" ;
      /* GeneXus formulas. */
      AV20Pgmname = "GestionLaboratorio.PCtrlOpcion" ;
      Gx_err = (short)(0) ;
   }

   private byte AV8NumeroAct ;
   private byte A5717Lb_numopu ;
   private byte A5718Lb_numop ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String AV14Usurcod ;
   private String AV15Station ;
   private String AV12LetraAct ;
   private String scmdbuf ;
   private String A5549Lb_UltOp ;
   private String A5555Lb_opcion ;
   private String AV20Pgmname ;
   private String AV13Inc_obs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04JZ2_A396EmprCod ;
   private int[] P04JZ2_A5532Lb_numero ;
   private byte[] P04JZ2_A5717Lb_numopu ;
   private String[] P04JZ2_A5549Lb_UltOp ;
   private String[] P04JZ3_A396EmprCod ;
   private int[] P04JZ3_A5532Lb_numero ;
   private byte[] P04JZ3_A5718Lb_numop ;
   private String[] P04JZ3_A5555Lb_opcion ;
}

final  class pctrlopcion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04JZ2", "SELECT EmprCod, Lb_numero, Lb_numopu, Lb_UltOp FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04JZ3", "SELECT EmprCod, Lb_numero, Lb_numop, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04JZ4", "UPDATE TXPENS001 SET Lb_numopu=?, Lb_UltOp=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

