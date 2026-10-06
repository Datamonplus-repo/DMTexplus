package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.maquinastareaspendientesexportcsv", "/app.maquinastareaspendientesexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class maquinastareaspendientesexportcsv extends GXWebObjectStub
{
   public maquinastareaspendientesexportcsv( )
   {
   }

   public maquinastareaspendientesexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( maquinastareaspendientesexportcsv.class ));
   }

   public maquinastareaspendientesexportcsv( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new maquinastareaspendientesexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new maquinastareaspendientesexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Maquinas Tareas Pendientes Export CSV";
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

