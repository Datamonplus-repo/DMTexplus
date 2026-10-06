package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccionanalisismaquina", "/app.produccionanalisismaquina"})
@jakarta.servlet.annotation.MultipartConfig
public final  class produccionanalisismaquina extends GXWebObjectStub
{
   public produccionanalisismaquina( )
   {
   }

   public produccionanalisismaquina( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( produccionanalisismaquina.class ));
   }

   public produccionanalisismaquina( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new produccionanalisismaquina_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new produccionanalisismaquina_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Produccion Analisis Maquina";
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

