package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodels extends GXProcedure
{
   public pmodels( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodels.class ), "" );
   }

   public pmodels( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pmodels.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pmodels.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodels.this.AV9Clicod = aP1[0];
      this.aP1 = aP1;
      pmodels.this.AV10Artcod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04AM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9Clicod), AV10Artcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P04AM2_A65ArtCod[0] ;
         A252CliCod = P04AM2_A252CliCod[0] ;
         A758ProCod = P04AM2_A758ProCod[0] ;
         AV8Procod = A758ProCod ;
         /* Execute user subroutine: 'MODELS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'MODELS' Routine */
      returnInSub = false ;
      AV11Models = (byte)(0) ;
      /* Using cursor P04AM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9Clicod), AV10Artcod, AV8Procod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4658MdlCod = P04AM3_A4658MdlCod[0] ;
         A65ArtCod = P04AM3_A65ArtCod[0] ;
         A252CliCod = P04AM3_A252CliCod[0] ;
         AV11Models = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV11Models == 0 )
      {
         /* Execute user subroutine: 'NEWMODELS' */
         S121 ();
         if (returnInSub) return;
      }
   }

   public void S121( )
   {
      /* 'NEWMODELS' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPModels

      */
      A252CliCod = AV9Clicod ;
      A65ArtCod = AV10Artcod ;
      A4658MdlCod = AV8Procod ;
      A4659MdlDsc = " " ;
      n4659MdlDsc = false ;
      /* Using cursor P04AM4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, Boolean.valueOf(n4659MdlDsc), A4659MdlDsc});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModels");
      if ( (pr_default.getStatus(2) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPModPro

      */
      A252CliCod = AV9Clicod ;
      A65ArtCod = AV10Artcod ;
      A4658MdlCod = AV8Procod ;
      A758ProCod = AV8Procod ;
      /* Using cursor P04AM5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, A758ProCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModPro");
      if ( (pr_default.getStatus(3) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodels.this.A396EmprCod;
      this.aP1[0] = pmodels.this.AV9Clicod;
      this.aP2[0] = pmodels.this.AV10Artcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodels");
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
      P04AM2_A396EmprCod = new String[] {""} ;
      P04AM2_A65ArtCod = new String[] {""} ;
      P04AM2_A252CliCod = new int[1] ;
      P04AM2_A758ProCod = new String[] {""} ;
      A65ArtCod = "" ;
      A758ProCod = "" ;
      AV8Procod = "" ;
      P04AM3_A396EmprCod = new String[] {""} ;
      P04AM3_A4658MdlCod = new String[] {""} ;
      P04AM3_A65ArtCod = new String[] {""} ;
      P04AM3_A252CliCod = new int[1] ;
      A4658MdlCod = "" ;
      A4659MdlDsc = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodels__default(),
         new Object[] {
             new Object[] {
            P04AM2_A396EmprCod, P04AM2_A65ArtCod, P04AM2_A252CliCod, P04AM2_A758ProCod
            }
            , new Object[] {
            P04AM3_A396EmprCod, P04AM3_A4658MdlCod, P04AM3_A65ArtCod, P04AM3_A252CliCod
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

   private byte AV11Models ;
   private short Gx_err ;
   private int AV9Clicod ;
   private int A252CliCod ;
   private int GX_INS696 ;
   private int GX_INS697 ;
   private String A396EmprCod ;
   private String AV10Artcod ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String AV8Procod ;
   private String A4658MdlCod ;
   private String A4659MdlDsc ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n4659MdlDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04AM2_A396EmprCod ;
   private String[] P04AM2_A65ArtCod ;
   private int[] P04AM2_A252CliCod ;
   private String[] P04AM2_A758ProCod ;
   private String[] P04AM3_A396EmprCod ;
   private String[] P04AM3_A4658MdlCod ;
   private String[] P04AM3_A65ArtCod ;
   private int[] P04AM3_A252CliCod ;
}

final  class pmodels__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04AM2", "SELECT EmprCod, ArtCod, CliCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04AM3", "SELECT EmprCod, MdlCod, ArtCod, CliCod FROM TXPModels WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and MdlCod = ? ORDER BY EmprCod, CliCod, ArtCod, MdlCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04AM4", "INSERT INTO TXPModels(EmprCod, CliCod, ArtCod, MdlCod, MdlDsc) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPModels")
         ,new UpdateCursor("P04AM5", "INSERT INTO TXPModPro(EmprCod, CliCod, ArtCod, MdlCod, ProCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPModPro")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 40);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

