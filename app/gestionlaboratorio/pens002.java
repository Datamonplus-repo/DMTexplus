package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens002 extends GXProcedure
{
   public pens002( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens002.class ), "" );
   }

   public pens002( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 )
   {
      pens002.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      pens002.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens002.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens002.this.AV23OpcionOld = aP2[0];
      this.aP2 = aP2;
      pens002.this.AV21Lb_opcion = aP3[0];
      this.aP3 = aP3;
      pens002.this.AV22Lb_numop = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV25EnsMan ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENSMAN", ""), GXv_int2) ;
      pens002.this.GXt_int1 = GXv_int2[0] ;
      AV25EnsMan = GXt_int1 ;
      AV15Letras = httpContext.getMessage( "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", "") ;
      /* Using cursor P01T52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5549Lb_UltOp = P01T52_A5549Lb_UltOp[0] ;
         A5717Lb_numopu = P01T52_A5717Lb_numopu[0] ;
         if ( (GXutil.strcmp("", A5549Lb_UltOp)==0) )
         {
            AV21Lb_opcion = httpContext.getMessage( "A", "") ;
            AV18SigLetra = httpContext.getMessage( "A", "") ;
         }
         else
         {
            AV17LetraAct = A5549Lb_UltOp ;
            /* Execute user subroutine: 'SIGLETRA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV21Lb_opcion = AV18SigLetra ;
         }
         A5717Lb_numopu = (byte)(A5717Lb_numopu+1) ;
         A5549Lb_UltOp = AV18SigLetra ;
         AV22Lb_numop = A5717Lb_numopu ;
         /* Using cursor P01T53 */
         pr_default.execute(1, new Object[] {A5549Lb_UltOp, Byte.valueOf(A5717Lb_numopu), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens002");
      cleanup();
   }

   public void S111( )
   {
      /* 'SIGLETRA' Routine */
      returnInSub = false ;
      AV16Cont = (byte)(1) ;
      while ( GXutil.strcmp(GXutil.substring( AV15Letras, AV16Cont, 1), AV17LetraAct) != 0 )
      {
         AV16Cont = (byte)(AV16Cont+1) ;
      }
      AV16Cont = (byte)(AV16Cont+1) ;
      AV18SigLetra = GXutil.substring( AV15Letras, AV16Cont, 1) ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens002.this.A396EmprCod;
      this.aP1[0] = pens002.this.A5532Lb_numero;
      this.aP2[0] = pens002.this.AV23OpcionOld;
      this.aP3[0] = pens002.this.AV21Lb_opcion;
      this.aP4[0] = pens002.this.AV22Lb_numop;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens002");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV15Letras = "" ;
      scmdbuf = "" ;
      P01T52_A396EmprCod = new String[] {""} ;
      P01T52_A5532Lb_numero = new int[1] ;
      P01T52_A5549Lb_UltOp = new String[] {""} ;
      P01T52_A5717Lb_numopu = new byte[1] ;
      A5549Lb_UltOp = "" ;
      AV18SigLetra = "" ;
      AV17LetraAct = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens002__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens002__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens002__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens002__default(),
         new Object[] {
             new Object[] {
            P01T52_A396EmprCod, P01T52_A5532Lb_numero, P01T52_A5549Lb_UltOp, P01T52_A5717Lb_numopu
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22Lb_numop ;
   private byte AV25EnsMan ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A5717Lb_numopu ;
   private byte AV16Cont ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String AV23OpcionOld ;
   private String AV21Lb_opcion ;
   private String AV15Letras ;
   private String scmdbuf ;
   private String A5549Lb_UltOp ;
   private String AV18SigLetra ;
   private String AV17LetraAct ;
   private boolean returnInSub ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01T52_A396EmprCod ;
   private int[] P01T52_A5532Lb_numero ;
   private String[] P01T52_A5549Lb_UltOp ;
   private byte[] P01T52_A5717Lb_numopu ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pens002__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pens002__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pens002__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pens002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01T52", "SELECT EmprCod, Lb_numero, Lb_UltOp, Lb_numopu FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01T53", "UPDATE TXPENS001 SET Lb_UltOp=?, Lb_numopu=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               stmt.setString(1, (String)parms[0], 1);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

