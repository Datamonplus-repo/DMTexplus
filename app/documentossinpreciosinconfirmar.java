package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentossinpreciosinconfirmar", "/app.documentossinpreciosinconfirmar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentossinpreciosinconfirmar extends GXWebObjectStub
{
   public documentossinpreciosinconfirmar( )
   {
   }

   public documentossinpreciosinconfirmar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentossinpreciosinconfirmar.class ));
   }

   public documentossinpreciosinconfirmar( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentossinpreciosinconfirmar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentossinpreciosinconfirmar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documentos Sin Precio Sin Confirmar";
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

