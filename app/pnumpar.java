package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumpar extends GXProcedure
{
   public pnumpar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumpar.class ), "" );
   }

   public pnumpar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pnumpar.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pnumpar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumpar.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pnumpar.this.AV20Reo = aP2[0];
      this.aP2 = aP2;
      pnumpar.this.AV15BarParPan = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Lindalana = (byte)(0) ;
      GXv_int1[0] = AV22Lindalana ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int1) ;
      pnumpar.this.AV22Lindalana = GXv_int1[0] ;
      AV16Letras = httpContext.getMessage( "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!\"#$%&()+,-./:;<>=@[\\]^_{|}~", "") ;
      AV21JBMartin = (byte)(0) ;
      GXv_int1[0] = AV21JBMartin ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBMAR", ""), GXv_int1) ;
      pnumpar.this.AV21JBMartin = GXv_int1[0] ;
      /* Using cursor P000P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(AV20Reo), Byte.valueOf(AV21JBMartin), Byte.valueOf(AV22Lindalana), Byte.valueOf(AV21JBMartin), Byte.valueOf(AV22Lindalana)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A132BarCodReo = P000P2_A132BarCodReo[0] ;
         A130BarCodPar = P000P2_A130BarCodPar[0] ;
         A137BarConPar = P000P2_A137BarConPar[0] ;
         if ( GXutil.strcmp(A137BarConPar, " ") == 0 )
         {
            AV15BarParPan = httpContext.getMessage( "A", "") ;
            A137BarConPar = httpContext.getMessage( "A", "") ;
         }
         else
         {
            AV18LetraAct = A137BarConPar ;
            /* Execute user subroutine: 'SIGLETRA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            A137BarConPar = AV19SigLetra ;
            AV15BarParPan = AV19SigLetra ;
         }
         /* Using cursor P000P3 */
         pr_default.execute(1, new Object[] {A137BarConPar, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV22Lindalana == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pnumpar");
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SIGLETRA' Routine */
      returnInSub = false ;
      AV17Cont = (byte)(1) ;
      while ( GXutil.strcmp(GXutil.substring( AV16Letras, AV17Cont, 1), AV18LetraAct) != 0 )
      {
         AV17Cont = (byte)(AV17Cont+1) ;
      }
      AV17Cont = (byte)(AV17Cont+1) ;
      AV19SigLetra = GXutil.substring( AV16Letras, AV17Cont, 1) ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumpar.this.A396EmprCod;
      this.aP1[0] = pnumpar.this.A129BarCod;
      this.aP2[0] = pnumpar.this.AV20Reo;
      this.aP3[0] = pnumpar.this.AV15BarParPan;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Letras = "" ;
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P000P2_A396EmprCod = new String[] {""} ;
      P000P2_A129BarCod = new int[1] ;
      P000P2_A132BarCodReo = new byte[1] ;
      P000P2_A130BarCodPar = new String[] {""} ;
      P000P2_A137BarConPar = new String[] {""} ;
      A130BarCodPar = "" ;
      A137BarConPar = "" ;
      AV18LetraAct = "" ;
      AV19SigLetra = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pnumpar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pnumpar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pnumpar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumpar__default(),
         new Object[] {
             new Object[] {
            P000P2_A396EmprCod, P000P2_A129BarCod, P000P2_A132BarCodReo, P000P2_A130BarCodPar, P000P2_A137BarConPar
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20Reo ;
   private byte AV22Lindalana ;
   private byte AV21JBMartin ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte AV17Cont ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV15BarParPan ;
   private String AV16Letras ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A137BarConPar ;
   private String AV18LetraAct ;
   private String AV19SigLetra ;
   private boolean returnInSub ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P000P2_A396EmprCod ;
   private int[] P000P2_A129BarCod ;
   private byte[] P000P2_A132BarCodReo ;
   private String[] P000P2_A130BarCodPar ;
   private String[] P000P2_A137BarConPar ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pnumpar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pnumpar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pnumpar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pnumpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000P2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarConPar FROM TXPBARCAD WHERE (EmprCod = ? and BarCod = ?) AND (BarCodPar = ' ') AND (( BarCodReo = ? and ? = 0 and ? = 0) or ( BarCodReo = 0 and ( ? = 1 or ? = 1))) ORDER BY EmprCod, BarCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000P3", "UPDATE TXPBARCAD SET BarConPar=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

