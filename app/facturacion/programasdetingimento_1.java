package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.programasdetingimento_1", "/app.facturacion.programasdetingimento_1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class programasdetingimento_1 extends GXWebObjectStub
{
   public programasdetingimento_1( )
   {
   }

   public programasdetingimento_1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( programasdetingimento_1.class ));
   }

   public programasdetingimento_1( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new programasdetingimento_1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new programasdetingimento_1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Programas de Tingimento";
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

