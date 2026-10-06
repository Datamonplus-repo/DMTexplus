package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tminvstwwexportreport", "/app.mantenimientomaquina.tminvstwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tminvstwwexportreport extends GXWebObjectStub
{
   public tminvstwwexportreport( )
   {
   }

   public tminvstwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tminvstwwexportreport.class ));
   }

   public tminvstwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tminvstwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tminvstwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista de Inventarios de Stock";
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

