package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.reclamacionesynoconformidadeswcexportcsv", "/app.reclamacionesynoconformidadeswcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class reclamacionesynoconformidadeswcexportcsv extends GXWebObjectStub
{
   public reclamacionesynoconformidadeswcexportcsv( )
   {
   }

   public reclamacionesynoconformidadeswcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( reclamacionesynoconformidadeswcexportcsv.class ));
   }

   public reclamacionesynoconformidadeswcexportcsv( int remoteHandle ,
                                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new reclamacionesynoconformidadeswcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new reclamacionesynoconformidadeswcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Reclamacionesy No Conformidades WCExport CSV";
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

