package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class crearfiltro extends GXProcedure
{
   public crearfiltro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crearfiltro.class ), "" );
   }

   public crearfiltro( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( app.ingenieria.SdtInFilSDT aP0 ,
                              long[] aP1 ,
                              String[] aP2 )
   {
      crearfiltro.this.aP3 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( app.ingenieria.SdtInFilSDT aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        boolean[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( app.ingenieria.SdtInFilSDT aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             boolean[] aP3 )
   {
      crearfiltro.this.AV8InFilSDT = aP0;
      crearfiltro.this.aP1 = aP1;
      crearfiltro.this.aP2 = aP2;
      crearfiltro.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ( GXutil.strcmp(AV8InFilSDT.getgxTv_SdtInFilSDT_Infiltkn(), " ") == 0 ) || (GXutil.strcmp("", AV8InFilSDT.getgxTv_SdtInFilSDT_Infiltkn())==0) )
      {
         AV12sdtMTok.fromJSonString(AV14WebSession.getValue("TexplusNET_Token"), null);
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Web Session token>%1", ""), AV12sdtMTok.toJSonString(false, true), "", "", "", "", "", "", "", ""), AV18Pgmname) ;
         AV11InFilTkn = AV12sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ;
      }
      else
      {
         AV11InFilTkn = AV8InFilSDT.getgxTv_SdtInFilSDT_Infiltkn() ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "recibe el   token>%1   InFilSDT:%2", ""), AV11InFilTkn, AV8InFilSDT.toJSonString(false, true), "", "", "", "", "", "", ""), AV18Pgmname) ;
      }
      AV9Existe = false ;
      AV19GXLvl12 = (byte)(0) ;
      /* Using cursor P0AUW2 */
      pr_default.execute(0, new Object[] {AV8InFilSDT.getgxTv_SdtInFilSDT_Infilemp(), AV8InFilSDT.getgxTv_SdtInFilSDT_Infilusu(), AV8InFilSDT.getgxTv_SdtInFilSDT_Infilip(), AV8InFilSDT.getgxTv_SdtInFilSDT_Infilobj(), AV11InFilTkn});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14704InFilTkn = P0AUW2_A14704InFilTkn[0] ;
         A14767InFilObj = P0AUW2_A14767InFilObj[0] ;
         A14776InFilIp = P0AUW2_A14776InFilIp[0] ;
         A14766InFilUsu = P0AUW2_A14766InFilUsu[0] ;
         A14777InFilEmp = P0AUW2_A14777InFilEmp[0] ;
         n14777InFilEmp = P0AUW2_n14777InFilEmp[0] ;
         A14768InFilFReg = P0AUW2_A14768InFilFReg[0] ;
         A14769InFilFIni = P0AUW2_A14769InFilFIni[0] ;
         n14769InFilFIni = P0AUW2_n14769InFilFIni[0] ;
         A14770InFilFFin = P0AUW2_A14770InFilFFin[0] ;
         n14770InFilFFin = P0AUW2_n14770InFilFFin[0] ;
         A14771InFilMaq = P0AUW2_A14771InFilMaq[0] ;
         n14771InFilMaq = P0AUW2_n14771InFilMaq[0] ;
         A14772InFilFase = P0AUW2_A14772InFilFase[0] ;
         n14772InFilFase = P0AUW2_n14772InFilFase[0] ;
         A14773InFilHdr = P0AUW2_A14773InFilHdr[0] ;
         n14773InFilHdr = P0AUW2_n14773InFilHdr[0] ;
         A14774InFilPar = P0AUW2_A14774InFilPar[0] ;
         n14774InFilPar = P0AUW2_n14774InFilPar[0] ;
         A14775InFilErr = P0AUW2_A14775InFilErr[0] ;
         n14775InFilErr = P0AUW2_n14775InFilErr[0] ;
         A14679InFilId = P0AUW2_A14679InFilId[0] ;
         AV19GXLvl12 = (byte)(1) ;
         A14768InFilFReg = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilfreg() ;
         A14769InFilFIni = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilfini() ;
         n14769InFilFIni = false ;
         A14770InFilFFin = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilffin() ;
         n14770InFilFFin = false ;
         A14771InFilMaq = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilmaq() ;
         n14771InFilMaq = false ;
         A14772InFilFase = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilfase() ;
         n14772InFilFase = false ;
         A14773InFilHdr = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilhdr() ;
         n14773InFilHdr = false ;
         A14774InFilPar = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilpar() ;
         n14774InFilPar = false ;
         A14775InFilErr = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilerr() ;
         n14775InFilErr = false ;
         A14777InFilEmp = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilemp() ;
         n14777InFilEmp = false ;
         A14704InFilTkn = AV11InFilTkn ;
         AV10InFilId = A14679InFilId ;
         AV9Existe = true ;
         /* Using cursor P0AUW3 */
         pr_default.execute(1, new Object[] {A14704InFilTkn, Boolean.valueOf(n14777InFilEmp), A14777InFilEmp, A14768InFilFReg, Boolean.valueOf(n14769InFilFIni), A14769InFilFIni, Boolean.valueOf(n14770InFilFFin), A14770InFilFFin, Boolean.valueOf(n14771InFilMaq), A14771InFilMaq, Boolean.valueOf(n14772InFilFase), A14772InFilFase, Boolean.valueOf(n14773InFilHdr), A14773InFilHdr, Boolean.valueOf(n14774InFilPar), A14774InFilPar, Boolean.valueOf(n14775InFilErr), Boolean.valueOf(A14775InFilErr), Long.valueOf(A14679InFilId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPInFil");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV19GXLvl12 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPInFil

         */
         A14777InFilEmp = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilemp() ;
         n14777InFilEmp = false ;
         A14766InFilUsu = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilusu() ;
         A14776InFilIp = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilip() ;
         A14767InFilObj = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilobj() ;
         A14768InFilFReg = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilfreg() ;
         A14769InFilFIni = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilfini() ;
         n14769InFilFIni = false ;
         A14770InFilFFin = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilffin() ;
         n14770InFilFFin = false ;
         A14771InFilMaq = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilmaq() ;
         n14771InFilMaq = false ;
         A14772InFilFase = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilfase() ;
         n14772InFilFase = false ;
         A14773InFilHdr = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilhdr() ;
         n14773InFilHdr = false ;
         A14774InFilPar = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilpar() ;
         n14774InFilPar = false ;
         A14775InFilErr = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilerr() ;
         n14775InFilErr = false ;
         A14777InFilEmp = AV8InFilSDT.getgxTv_SdtInFilSDT_Infilemp() ;
         n14777InFilEmp = false ;
         A14704InFilTkn = AV11InFilTkn ;
         /* Using cursor P0AUW4 */
         pr_default.execute(2, new Object[] {A14766InFilUsu, A14776InFilIp, A14767InFilObj, A14768InFilFReg, Boolean.valueOf(n14769InFilFIni), A14769InFilFIni, Boolean.valueOf(n14770InFilFFin), A14770InFilFFin, Boolean.valueOf(n14771InFilMaq), A14771InFilMaq, Boolean.valueOf(n14772InFilFase), A14772InFilFase, Boolean.valueOf(n14773InFilHdr), A14773InFilHdr, Boolean.valueOf(n14774InFilPar), A14774InFilPar, Boolean.valueOf(n14775InFilErr), Boolean.valueOf(A14775InFilErr), Boolean.valueOf(n14777InFilEmp), A14777InFilEmp, A14704InFilTkn});
         /* Retrieving last key number assigned */
         /* Using cursor P0AUW5 */
         pr_default.execute(3);
         A14679InFilId = P0AUW5_A14679InFilId[0] ;
         pr_default.close(3);
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPInFil");
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
         AV10InFilId = A14679InFilId ;
         if ( AV10InFilId > 0 )
         {
            AV9Existe = true ;
         }
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.crearfiltro");
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = crearfiltro.this.AV10InFilId;
      this.aP2[0] = crearfiltro.this.AV11InFilTkn;
      this.aP3[0] = crearfiltro.this.AV9Existe;
      Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.crearfiltro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11InFilTkn = "" ;
      AV12sdtMTok = new app.anticipacionerrores.SdtsdtMTok(remoteHandle, context);
      AV14WebSession = httpContext.getWebSession();
      AV18Pgmname = "" ;
      scmdbuf = "" ;
      P0AUW2_A14704InFilTkn = new String[] {""} ;
      P0AUW2_A14767InFilObj = new String[] {""} ;
      P0AUW2_A14776InFilIp = new String[] {""} ;
      P0AUW2_A14766InFilUsu = new String[] {""} ;
      P0AUW2_A14777InFilEmp = new String[] {""} ;
      P0AUW2_n14777InFilEmp = new boolean[] {false} ;
      P0AUW2_A14768InFilFReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUW2_A14769InFilFIni = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUW2_n14769InFilFIni = new boolean[] {false} ;
      P0AUW2_A14770InFilFFin = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUW2_n14770InFilFFin = new boolean[] {false} ;
      P0AUW2_A14771InFilMaq = new String[] {""} ;
      P0AUW2_n14771InFilMaq = new boolean[] {false} ;
      P0AUW2_A14772InFilFase = new String[] {""} ;
      P0AUW2_n14772InFilFase = new boolean[] {false} ;
      P0AUW2_A14773InFilHdr = new String[] {""} ;
      P0AUW2_n14773InFilHdr = new boolean[] {false} ;
      P0AUW2_A14774InFilPar = new String[] {""} ;
      P0AUW2_n14774InFilPar = new boolean[] {false} ;
      P0AUW2_A14775InFilErr = new boolean[] {false} ;
      P0AUW2_n14775InFilErr = new boolean[] {false} ;
      P0AUW2_A14679InFilId = new long[1] ;
      A14704InFilTkn = "" ;
      A14767InFilObj = "" ;
      A14776InFilIp = "" ;
      A14766InFilUsu = "" ;
      A14777InFilEmp = "" ;
      A14768InFilFReg = GXutil.resetTime( GXutil.nullDate() );
      A14769InFilFIni = GXutil.resetTime( GXutil.nullDate() );
      A14770InFilFFin = GXutil.resetTime( GXutil.nullDate() );
      A14771InFilMaq = "" ;
      A14772InFilFase = "" ;
      A14773InFilHdr = "" ;
      A14774InFilPar = "" ;
      P0AUW5_A14679InFilId = new long[1] ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.crearfiltro__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.crearfiltro__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.crearfiltro__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.crearfiltro__default(),
         new Object[] {
             new Object[] {
            P0AUW2_A14704InFilTkn, P0AUW2_A14767InFilObj, P0AUW2_A14776InFilIp, P0AUW2_A14766InFilUsu, P0AUW2_A14777InFilEmp, P0AUW2_n14777InFilEmp, P0AUW2_A14768InFilFReg, P0AUW2_A14769InFilFIni, P0AUW2_n14769InFilFIni, P0AUW2_A14770InFilFFin,
            P0AUW2_n14770InFilFFin, P0AUW2_A14771InFilMaq, P0AUW2_n14771InFilMaq, P0AUW2_A14772InFilFase, P0AUW2_n14772InFilFase, P0AUW2_A14773InFilHdr, P0AUW2_n14773InFilHdr, P0AUW2_A14774InFilPar, P0AUW2_n14774InFilPar, P0AUW2_A14775InFilErr,
            P0AUW2_n14775InFilErr, P0AUW2_A14679InFilId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P0AUW5_A14679InFilId
            }
         }
      );
      AV18Pgmname = "Ingenieria.CrearFiltro" ;
      /* GeneXus formulas. */
      AV18Pgmname = "Ingenieria.CrearFiltro" ;
      Gx_err = (short)(0) ;
   }

   private byte AV19GXLvl12 ;
   private short Gx_err ;
   private int GX_INS1923 ;
   private long AV10InFilId ;
   private long A14679InFilId ;
   private String AV18Pgmname ;
   private String scmdbuf ;
   private String A14766InFilUsu ;
   private String A14777InFilEmp ;
   private String Gx_emsg ;
   private java.util.Date A14768InFilFReg ;
   private java.util.Date A14769InFilFIni ;
   private java.util.Date A14770InFilFFin ;
   private boolean AV9Existe ;
   private boolean n14777InFilEmp ;
   private boolean n14769InFilFIni ;
   private boolean n14770InFilFFin ;
   private boolean n14771InFilMaq ;
   private boolean n14772InFilFase ;
   private boolean n14773InFilHdr ;
   private boolean n14774InFilPar ;
   private boolean A14775InFilErr ;
   private boolean n14775InFilErr ;
   private String AV11InFilTkn ;
   private String A14704InFilTkn ;
   private String A14767InFilObj ;
   private String A14776InFilIp ;
   private String A14771InFilMaq ;
   private String A14772InFilFase ;
   private String A14773InFilHdr ;
   private String A14774InFilPar ;
   private com.genexus.webpanels.WebSession AV14WebSession ;
   private boolean[] aP3 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AUW2_A14704InFilTkn ;
   private String[] P0AUW2_A14767InFilObj ;
   private String[] P0AUW2_A14776InFilIp ;
   private String[] P0AUW2_A14766InFilUsu ;
   private String[] P0AUW2_A14777InFilEmp ;
   private boolean[] P0AUW2_n14777InFilEmp ;
   private java.util.Date[] P0AUW2_A14768InFilFReg ;
   private java.util.Date[] P0AUW2_A14769InFilFIni ;
   private boolean[] P0AUW2_n14769InFilFIni ;
   private java.util.Date[] P0AUW2_A14770InFilFFin ;
   private boolean[] P0AUW2_n14770InFilFFin ;
   private String[] P0AUW2_A14771InFilMaq ;
   private boolean[] P0AUW2_n14771InFilMaq ;
   private String[] P0AUW2_A14772InFilFase ;
   private boolean[] P0AUW2_n14772InFilFase ;
   private String[] P0AUW2_A14773InFilHdr ;
   private boolean[] P0AUW2_n14773InFilHdr ;
   private String[] P0AUW2_A14774InFilPar ;
   private boolean[] P0AUW2_n14774InFilPar ;
   private boolean[] P0AUW2_A14775InFilErr ;
   private boolean[] P0AUW2_n14775InFilErr ;
   private long[] P0AUW2_A14679InFilId ;
   private long[] P0AUW5_A14679InFilId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private app.ingenieria.SdtInFilSDT AV8InFilSDT ;
   private app.anticipacionerrores.SdtsdtMTok AV12sdtMTok ;
}

final  class crearfiltro__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class crearfiltro__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class crearfiltro__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class crearfiltro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AUW2", "SELECT InFilTkn, InFilObj, InFilIp, InFilUsu, InFilEmp, InFilFReg, InFilFIni, InFilFFin, InFilMaq, InFilFase, InFilHdr, InFilPar, InFilErr, InFilId FROM TXPInFil WHERE (InFilEmp = ?) AND (InFilUsu = ?) AND (InFilIp = ?) AND (InFilObj = ?) AND (InFilTkn = ?) ORDER BY InFilId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AUW3", "UPDATE TXPInFil SET InFilTkn=?, InFilEmp=?, InFilFReg=?, InFilFIni=?, InFilFFin=?, InFilMaq=?, InFilFase=?, InFilHdr=?, InFilPar=?, InFilErr=?  WHERE InFilId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPInFil")
         ,new UpdateCursor("P0AUW4", "INSERT INTO TXPInFil(InFilUsu, InFilIp, InFilObj, InFilFReg, InFilFIni, InFilFFin, InFilMaq, InFilFase, InFilHdr, InFilPar, InFilErr, InFilEmp, InFilTkn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPInFil")
         ,new ForEachCursor("P0AUW5", "SELECT InFilId.CURRVAL FROM DUAL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6, true);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((boolean[]) buf[19])[0] = rslt.getBoolean(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(14);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 20);
               stmt.setVarchar(4, (String)parms[3], 100);
               stmt.setVarchar(5, (String)parms[4], 256);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 256, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
               }
               stmt.setDateTime(3, (java.util.Date)parms[3], false, true);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[9], 120000);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[11], 120000);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 120000);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[15], 120000);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(10, ((Boolean) parms[17]).booleanValue());
               }
               stmt.setLong(11, ((Number) parms[18]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false, true);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[9], 120000);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 120000);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[13], 120000);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 120000);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(11, ((Boolean) parms[17]).booleanValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 3);
               }
               stmt.setVarchar(13, (String)parms[20], 256, false);
               return;
      }
   }

}

