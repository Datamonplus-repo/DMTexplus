package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwmaqfasexportreport", "/app.webwmaqfasexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwmaqfasexportreport extends GXWebObjectStub
{
   public webwmaqfasexportreport( )
   {
   }

   public webwmaqfasexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwmaqfasexportreport.class ));
   }

   public webwmaqfasexportreport( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwmaqfasexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwmaqfasexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Maquinas p/Fase";
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

