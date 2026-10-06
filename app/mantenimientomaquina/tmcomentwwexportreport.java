package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmcomentwwexportreport", "/app.mantenimientomaquina.tmcomentwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmcomentwwexportreport extends GXWebObjectStub
{
   public tmcomentwwexportreport( )
   {
   }

   public tmcomentwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmcomentwwexportreport.class ));
   }

   public tmcomentwwexportreport( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmcomentwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmcomentwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMCom Ent WWExport Report";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

