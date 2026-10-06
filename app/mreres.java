package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mreres", "/app.mreres"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mreres extends GXWebObjectStub
{
   public mreres( )
   {
   }

   public mreres( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mreres.class ));
   }

   public mreres( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mreres_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mreres_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla MRERES (Reserva de Repuestos)";
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

