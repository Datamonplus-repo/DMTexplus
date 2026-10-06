package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.mrec_simular", "/app.ingenieria.mrec_simular"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mrec_simular extends GXWebObjectStub
{
   public mrec_simular( )
   {
   }

   public mrec_simular( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mrec_simular.class ));
   }

   public mrec_simular( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mrec_simular_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mrec_simular_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Simular recepción de datos de las máquinas";
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

