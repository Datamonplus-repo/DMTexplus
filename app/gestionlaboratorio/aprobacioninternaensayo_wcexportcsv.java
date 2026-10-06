package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.aprobacioninternaensayo_wcexportcsv", "/app.gestionlaboratorio.aprobacioninternaensayo_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class aprobacioninternaensayo_wcexportcsv extends GXWebObjectStub
{
   public aprobacioninternaensayo_wcexportcsv( )
   {
   }

   public aprobacioninternaensayo_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( aprobacioninternaensayo_wcexportcsv.class ));
   }

   public aprobacioninternaensayo_wcexportcsv( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aprobacioninternaensayo_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new aprobacioninternaensayo_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Aprobacion Interna Ensayo_WCExport CSV";
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

