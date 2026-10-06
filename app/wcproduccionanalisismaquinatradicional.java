package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcproduccionanalisismaquinatradicional", "/app.wcproduccionanalisismaquinatradicional"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcproduccionanalisismaquinatradicional extends GXWebObjectStub
{
   public wcproduccionanalisismaquinatradicional( )
   {
   }

   public wcproduccionanalisismaquinatradicional( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcproduccionanalisismaquinatradicional.class ));
   }

   public wcproduccionanalisismaquinatradicional( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcproduccionanalisismaquinatradicional_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcproduccionanalisismaquinatradicional_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProduccion Analisis Maquina Tradicional";
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

