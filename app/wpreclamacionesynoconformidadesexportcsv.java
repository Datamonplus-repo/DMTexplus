package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wpreclamacionesynoconformidadesexportcsv", "/app.wpreclamacionesynoconformidadesexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wpreclamacionesynoconformidadesexportcsv extends GXWebObjectStub
{
   public wpreclamacionesynoconformidadesexportcsv( )
   {
   }

   public wpreclamacionesynoconformidadesexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wpreclamacionesynoconformidadesexportcsv.class ));
   }

   public wpreclamacionesynoconformidadesexportcsv( int remoteHandle ,
                                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpreclamacionesynoconformidadesexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpreclamacionesynoconformidadesexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WPReclamacionesy No Conformidades Export CSV";
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

