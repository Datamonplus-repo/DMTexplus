package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.devolucionalmacentejidocrudosindetalle", "/app.devolucionalmacentejidocrudosindetalle"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devolucionalmacentejidocrudosindetalle extends GXWebObjectStub
{
   public devolucionalmacentejidocrudosindetalle( )
   {
   }

   public devolucionalmacentejidocrudosindetalle( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devolucionalmacentejidocrudosindetalle.class ));
   }

   public devolucionalmacentejidocrudosindetalle( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devolucionalmacentejidocrudosindetalle_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devolucionalmacentejidocrudosindetalle_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Devolucion Almacen Tejido Crudo (sin detalle)";
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

