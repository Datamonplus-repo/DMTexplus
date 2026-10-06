package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.tprequiwwexportcsv", "/app.gestionlaboratorio.tprequiwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprequiwwexportcsv extends GXWebObjectStub
{
   public tprequiwwexportcsv( )
   {
   }

   public tprequiwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprequiwwexportcsv.class ));
   }

   public tprequiwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprequiwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprequiwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipos de Preparacion";
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

