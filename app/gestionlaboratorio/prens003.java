package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prens003 extends GXProcedure
{
   public prens003( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prens003.class ), "" );
   }

   public prens003( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      prens003.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      prens003.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prens003.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Lb_numop = (byte)(0) ;
      /* Using cursor P03BJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5718Lb_numop = P03BJ2_A5718Lb_numop[0] ;
         A5555Lb_opcion = P03BJ2_A5555Lb_opcion[0] ;
         AV9Lb_opcion = A5555Lb_opcion ;
         AV8Lb_numop = A5718Lb_numop ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ( GXutil.strcmp(AV9Lb_opcion, httpContext.getMessage( "A", "")) == 0 ) && ( AV8Lb_numop != 1 ) )
      {
         AV8Lb_numop = (byte)(1) ;
      }
      if ( AV8Lb_numop == 1 )
      {
         /* Using cursor P03BJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5718Lb_numop = P03BJ3_A5718Lb_numop[0] ;
            A5555Lb_opcion = P03BJ3_A5555Lb_opcion[0] ;
            A5718Lb_numop = AV8Lb_numop ;
            AV8Lb_numop = (byte)(AV8Lb_numop+1) ;
            /* Using cursor P03BJ4 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A5718Lb_numop), A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Optimized UPDATE. */
         /* Using cursor P03BJ5 */
         pr_default.execute(3, new Object[] {Byte.valueOf(AV8Lb_numop), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prens003.this.A396EmprCod;
      this.aP1[0] = prens003.this.A5532Lb_numero;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.prens003");
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
      P03BJ2_A396EmprCod = new String[] {""} ;
      P03BJ2_A5532Lb_numero = new int[1] ;
      P03BJ2_A5718Lb_numop = new byte[1] ;
      P03BJ2_A5555Lb_opcion = new String[] {""} ;
      A5555Lb_opcion = "" ;
      AV9Lb_opcion = "" ;
      P03BJ3_A396EmprCod = new String[] {""} ;
      P03BJ3_A5532Lb_numero = new int[1] ;
      P03BJ3_A5718Lb_numop = new byte[1] ;
      P03BJ3_A5555Lb_opcion = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.prens003__default(),
         new Object[] {
             new Object[] {
            P03BJ2_A396EmprCod, P03BJ2_A5532Lb_numero, P03BJ2_A5718Lb_numop, P03BJ2_A5555Lb_opcion
            }
            , new Object[] {
            P03BJ3_A396EmprCod, P03BJ3_A5532Lb_numero, P03BJ3_A5718Lb_numop, P03BJ3_A5555Lb_opcion
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

   private byte AV8Lb_numop ;
   private byte A5718Lb_numop ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String AV9Lb_opcion ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03BJ2_A396EmprCod ;
   private int[] P03BJ2_A5532Lb_numero ;
   private byte[] P03BJ2_A5718Lb_numop ;
   private String[] P03BJ2_A5555Lb_opcion ;
   private String[] P03BJ3_A396EmprCod ;
   private int[] P03BJ3_A5532Lb_numero ;
   private byte[] P03BJ3_A5718Lb_numop ;
   private String[] P03BJ3_A5555Lb_opcion ;
}

final  class prens003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03BJ2", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_numop, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03BJ3", "SELECT EmprCod, Lb_numero, Lb_numop, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03BJ4", "UPDATE TXPENS002 SET Lb_numop=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
         ,new UpdateCursor("P03BJ5", "UPDATE TXPENS001 SET Lb_numopu=? - 1  WHERE EmprCod = ? and Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

