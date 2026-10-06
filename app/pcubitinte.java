package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcubitinte extends GXProcedure
{
   public pcubitinte( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcubitinte.class ), "" );
   }

   public pcubitinte( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pcubitinte.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pcubitinte.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcubitinte.this.AV10AlbRLoc = aP1[0];
      this.aP1 = aP1;
      pcubitinte.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      AV12i = (byte)(1) ;
      while ( AV12i <= 10 )
      {
         AV11Ubicacion = GXutil.substring( AV10AlbRLoc, AV12i, 3) ;
         if ( GXutil.strcmp(AV11Ubicacion, " ") != 0 )
         {
            /* Execute user subroutine: 'UBICACION' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(Gx_msg, " ") != 0 )
            {
               if (true) break;
            }
         }
         AV12i = (byte)(AV12i+3) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'UBICACION' Routine */
      returnInSub = false ;
      Gx_msg = " " ;
      AV16GXLvl17 = (byte)(0) ;
      /* Using cursor P05DT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV11Ubicacion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8688Ub_CodUb = P05DT2_A8688Ub_CodUb[0] ;
         A8686Ub_CodZ = P05DT2_A8686Ub_CodZ[0] ;
         AV16GXLvl17 = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV16GXLvl17 == 0 )
      {
         Gx_msg = httpContext.getMessage( "Error.No existe Ubicacion ", "") + GXutil.trim( AV11Ubicacion) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcubitinte.this.A396EmprCod;
      this.aP1[0] = pcubitinte.this.AV10AlbRLoc;
      this.aP2[0] = pcubitinte.this.Gx_msg;
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
      AV11Ubicacion = "" ;
      scmdbuf = "" ;
      P05DT2_A396EmprCod = new String[] {""} ;
      P05DT2_A8688Ub_CodUb = new String[] {""} ;
      P05DT2_A8686Ub_CodZ = new short[1] ;
      A8688Ub_CodUb = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcubitinte__default(),
         new Object[] {
             new Object[] {
            P05DT2_A396EmprCod, P05DT2_A8688Ub_CodUb, P05DT2_A8686Ub_CodZ
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12i ;
   private byte AV16GXLvl17 ;
   private short A8686Ub_CodZ ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV10AlbRLoc ;
   private String Gx_msg ;
   private String AV11Ubicacion ;
   private String scmdbuf ;
   private String A8688Ub_CodUb ;
   private boolean returnInSub ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05DT2_A396EmprCod ;
   private String[] P05DT2_A8688Ub_CodUb ;
   private short[] P05DT2_A8686Ub_CodZ ;
}

final  class pcubitinte__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05DT2", "SELECT EmprCod, Ub_CodUb, Ub_CodZ FROM TXPUBICA WHERE EmprCod = ? and Ub_CodUb = ? ORDER BY EmprCod, Ub_CodUb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

