package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevcrudevolucionalmacentejidocrudosindetalle", "/app.tdevcrudevolucionalmacentejidocrudosindetalle"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevcrudevolucionalmacentejidocrudosindetalle extends GXWebObjectStub
{
   public tdevcrudevolucionalmacentejidocrudosindetalle( )
   {
   }

   public tdevcrudevolucionalmacentejidocrudosindetalle( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevcrudevolucionalmacentejidocrudosindetalle.class ));
   }

   public tdevcrudevolucionalmacentejidocrudosindetalle( int remoteHandle ,
                                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevcrudevolucionalmacentejidocrudosindetalle_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevcrudevolucionalmacentejidocrudosindetalle_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDEVCRUDevolucion Almacen Tejido Crudosindetalle";
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

