package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqfaswwexportreport", "/app.tmaqfaswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqfaswwexportreport extends GXWebObjectStub
{
   public tmaqfaswwexportreport( )
   {
   }

   public tmaqfaswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqfaswwexportreport.class ));
   }

   public tmaqfaswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqfaswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqfaswwexportreport_impl(context).cleanup();
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

